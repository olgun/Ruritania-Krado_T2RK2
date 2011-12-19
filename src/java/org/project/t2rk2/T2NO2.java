/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.project.t2rk2;

import cs.ut.ee.esi.manager.DataSourceManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import t2no2api.LoadProfileResponse;
import t2no2api.QualitySeriesResponse;
import t2no2api.SupplierChangeResponse;

/**
 *
 * @author toshiba
 */
public class T2NO2 {
    
    
    
    DataSourceManager dbManager = DataSourceManager.getDataSourceManagerInstance();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    
    public String qualitySeries(String date, int value) throws ParseException, DatatypeConfigurationException, InterruptedException {
        t2no2api.T2NO2ApiService service = new t2no2api.T2NO2ApiService();
        t2no2api.T2NO2ApiPortType port = service.getT2NO2ApiPort();

        t2no2api.QualitySeries qualitySeriesRequest = new t2no2api.QualitySeries();

        qualitySeriesRequest.setFrom("T2RK2");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        GregorianCalendar timeStampCalendar = new GregorianCalendar();
        timeStampCalendar.setTime(formatter.parse(date));
        XMLGregorianCalendar timeStamp = DatatypeFactory.newInstance().newXMLGregorianCalendar(timeStampCalendar);

        qualitySeriesRequest.setTimestamp(timeStamp);
        qualitySeriesRequest.setValue(value);

        QualitySeriesResponse response;
        Boolean successful = false;

        try {
            response = port.qualitySeries(qualitySeriesRequest);
            if (response.getResultCode() == 0) {
                return "Process Executed Successfully.";
            }
            return "Process cannot be completed";
        } catch (Exception e) {
            Thread.sleep(20000);
        }

        if (!successful) {
            try {
                response = port.qualitySeries(qualitySeriesRequest);
                if (response.getResultCode() == 0) {
                    return "Process Executed Successfully.";
                }
                return "Process cannot be completed.";
            } catch (Exception e) {
                Thread.sleep(20000);
            }
        }

        if (!successful) {
            try {
                response = port.qualitySeries(qualitySeriesRequest);
                if (response.getResultCode() == 0) {
                    return "Process Executed Successfully.";
                }
                return "Process cannot be completed.";
            } catch (Exception e) {
                return "Process cannot be completed.";
            }
        }

        return null;
    }



    public String loadProfile(String supplierID) throws SQLException {
        t2no2api.T2NO2ApiService service = new t2no2api.T2NO2ApiService();
        t2no2api.T2NO2ApiPortType port = service.getT2NO2ApiPort();

        t2no2api.LoadProfile loadProfileRequest = new t2no2api.LoadProfile();

        //Check if Supplier Exists
        String message = null;
        
        try {
            connection = dbManager.getConnection();

            String sql = "SELECT COUNT(*) FROM load_profile_share where electricitySupplierID = '" + supplierID + "'";

            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(sql);

            if (resultSet == null) {
                return "Process cannot be completed. ID doesn't exist.";
            } else if (resultSet.next()) {
                if (resultSet.getInt(1) == 0) {
                    return "Process cannot be completed. ID doesn't exist.";
                }
            }

            //Retrieve as much data as you can and take the rest from interface
            String query = "select electricitySupplierID, profileSettlementAreaID, supplyMonth, sum(highLoadShare) as high, sum(lowLoadShare) as low from load_profile_share where load_profile_share.electricitySupplierID = '" + supplierID + "'";
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                t2no2api.ES es = new t2no2api.ES();
                es.setId(resultSet.getString("electricitySupplierID"));
                es.setName(resultSet.getString("electricitySupplierID"));

                loadProfileRequest.setES(es);

                t2no2api.TimePeriod timePeriod = new t2no2api.TimePeriod();

                GregorianCalendar timePeriodCalendar = new GregorianCalendar();
                timePeriodCalendar.setTime(resultSet.getDate("supplyMonth"));
                XMLGregorianCalendar timePeriodDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(timePeriodCalendar);

                timePeriod.setStart(timePeriodDate);
                timePeriod.setEnd(timePeriodDate);

                loadProfileRequest.setPeriod(timePeriod);

                Long value = (long) (resultSet.getFloat("high") + resultSet.getFloat("low"))/2;
                loadProfileRequest.setAmount(value);

                LoadProfileResponse response;
                Boolean successful = false;

                try {
                    response = port.loadProfile(loadProfileRequest);

                    if(response.getResultCode() == 0)
                        message = "Process Executed Successfully.";
                    else{
                        message = "Process cannot be completed.";
                    }
                    
                    successful = true;
                } catch (Exception e) {
                    Thread.sleep(20000);
                }

                if (!successful) {
                    try {
                        response = port.loadProfile(loadProfileRequest);

                    if(response.getResultCode() == 0)
                        message = "Process Executed Successfully.";
                    else
                        message = "Process cannot be completed.";

                    successful = true;
                    } catch (Exception e) {
                        Thread.sleep(20000);
                    }
                }

                if (!successful) {
                    try {
                        response = port.loadProfile(loadProfileRequest);

                    if(response.getResultCode() == 0)
                        message = "Process Completed Successfully.";
                    else
                        message = "Process cannot be completed";

                    successful = true;
                    } catch (Exception e) {
                        message = "Process cannot be completed";
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
    
    
    
    
    
    
    
    
    
}


