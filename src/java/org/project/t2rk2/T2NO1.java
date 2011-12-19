/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.project.t2rk2;

import cs.ut.ee.esi.manager.DataSourceManager;
import esi.t2no1.ws.service.LoadProfileOutput;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author toshiba
 */
public class T2NO1 {

    DataSourceManager dbManager = DataSourceManager.getDataSourceManagerInstance();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public String submitLoadProfile(String areaID, int lossConsumption) throws InterruptedException, SQLException {
        esi.t2no1.ws.impl.MeteringServiceImplService service = new esi.t2no1.ws.impl.MeteringServiceImplService();
        esi.t2no1.ws.impl.MeteringService port = service.getMeteringServiceImplPort();

        esi.t2no1.ws.service.LoadProfileInput loadProfileInput = new esi.t2no1.ws.service.LoadProfileInput();
        esi.t2no1.ws.service.LoadProfile loadProfile = new esi.t2no1.ws.service.LoadProfile();

        //Check if Supplier Exists
        String message = null;
        Statement statement = null;

        try {
            connection = dbManager.getConnection();

            String sql = "SELECT COUNT(*) FROM load_profile_share where profileSettlementAreaID = '" + areaID + "'";

            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(sql);

            if (resultSet == null) {
                return "Process cannot be ceompleted.ID doesn't exist.";
            } else if (resultSet.next()) {
                if (resultSet.getInt(1) == 0) {
                    return "Process cannot be ceompleted.ID doesn't exist.";
                }
            }

            //Retrieve as much data as you can and take the rest from interface
            String query = "select load_profile_share.electricitySupplierID, profileSettlementAreaID, supplyMonth, highLoadShare, lowLoadShare, consumptionValue from load_profile_share, Consumption_Plan where load_profile_share.electricitySupplierID = Consumption_Plan.electricitySupplierID";
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                loadProfile.setCalculationAreaId(resultSet.getString("profileSettlementAreaID"));
                loadProfile.setSupplierId(resultSet.getString("electricitySupplierID"));

                GregorianCalendar startDateCalendar = new GregorianCalendar();
                startDateCalendar.setTime(resultSet.getDate("supplyMonth"));
                XMLGregorianCalendar startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(startDateCalendar);

                loadProfile.setProfileStartDate(startDate);

                GregorianCalendar endDateCalendar = new GregorianCalendar();
                endDateCalendar.setTime(resultSet.getDate("supplyMonth"));
                XMLGregorianCalendar endDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(endDateCalendar);

                loadProfile.setProfileEndDate(endDate);

                //Total Area Input comes from Planned Consumption because Planned Consumption is production
                //and production should be area input
                loadProfile.setTotalAreaInput((long) resultSet.getFloat("plannedConsumption"));

                //Take value from Interface as nothing potentially helpful was saved in DB
                loadProfile.setNetworkLossConsumption((long) lossConsumption);

                //(High Load + Low Load)/2
                Long average = (long) (resultSet.getFloat("highLoadShare") + resultSet.getFloat("lowLoadShare")) / 2;
                loadProfile.setProfileSettledConsumption(average);

                loadProfileInput.setMessageId("1");
                loadProfileInput.setMessageType("Who knows");
                loadProfileInput.setLoadProfile(loadProfile);

                LoadProfileOutput output;
                Boolean successful = false;

                try {
                    output = port.submitLoadProfile(loadProfileInput);
                    message = "Process Executed Successfully.";
                    successful = true;
                } catch (Exception e) {
                    Thread.sleep(15000);
                }

                if (!successful) {
                    try {
                        output = port.submitLoadProfile(loadProfileInput);
                        message = "Process Executed Successfully";
                        successful = true;
                    } catch (Exception e) {
                        Thread.sleep(15000);
                    }
                }

                if (!successful) {
                    try {
                        output = port.submitLoadProfile(loadProfileInput);
                        message = "Process executed successfully.";
                        successful = true;
                    } catch (Exception e) {
                        message = "Process cannot be completed.";
                    }
                }
            }

      
        } catch (SQLException s) {
        } catch (Exception e) {
        } finally {
            if (statement != null) {
                statement.close();
                resultSet.close();
                connection.close();
            }
        }

        return message;
    }

    public String submitQualitySeries(int seriesID, String date, Float value) throws DatatypeConfigurationException, InterruptedException, ParseException {
        esi.t2no1.ws.impl.MeteringServiceImplService service = new esi.t2no1.ws.impl.MeteringServiceImplService();
        esi.t2no1.ws.impl.MeteringService port = service.getMeteringServiceImplPort();
        esi.t2no1.ws.service.QualitySeriesInput qualitySeriesInput = new esi.t2no1.ws.service.QualitySeriesInput();

        esi.t2no1.ws.service.QualitySeriesInput.QualitySeries series = new esi.t2no1.ws.service.QualitySeriesInput.QualitySeries();
        esi.t2no1.ws.service.QualitySeriesInput.QualitySeries.Entry entry = new esi.t2no1.ws.service.QualitySeriesInput.QualitySeries.Entry();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        GregorianCalendar keyCalendar = new GregorianCalendar();
        keyCalendar.setTime(formatter.parse(date));
        XMLGregorianCalendar key = DatatypeFactory.newInstance().newXMLGregorianCalendar(keyCalendar);

        entry.setKey(key);
        entry.setValue(value);

        series.getEntry().add(entry);

        qualitySeriesInput.setMessageId("10");
        qualitySeriesInput.setMessageType("who Knows");
        qualitySeriesInput.setSeriesId(seriesID);
        qualitySeriesInput.setQualitySeries(series);
        qualitySeriesInput.setSenderId("T2RK2");

        Boolean output = null;
        Boolean successful = false;

        try {
            output = port.submitQualitySeries(qualitySeriesInput);
            if(output)
                return "Process Executed Susscessfully";
            return "process cannot be completed.";
        } catch (Exception e) {
            Thread.sleep(15000);
        }

        if (!successful) {
            try {
                output = port.submitQualitySeries(qualitySeriesInput);
                if(output)
                    return "Process Executed Susscessfully.";
                return "Process cannot be completed";
            } catch (Exception e) {
                Thread.sleep(15000);
            }
        }

        if (!successful) {
            try {
                output = port.submitQualitySeries(qualitySeriesInput);
                if(output)
                    return "Process Executed Susscessfully..";
                return "Process cannot be completed";
            } catch (Exception e) {
                return "Process cannot be completed.";
            }
        }

        return null;
    }



}
