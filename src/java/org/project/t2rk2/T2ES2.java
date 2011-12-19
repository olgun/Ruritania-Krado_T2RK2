/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.project.t2rk2;

import cs.ut.ee.esi.manager.DataSourceManager;
import ee.ut.cs.esi.t2es2.services.AnnualConsumptionResponse;
import ee.ut.cs.esi.t2es2.services.BalanceInvoiceResponse;
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
public class T2ES2 {
    
    DataSourceManager dbManager = DataSourceManager.getDataSourceManagerInstance();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;



    public String submitAnnualConsumptionReport(String messageID, String name, String phone, String postalAddress, String startDate, String endDate) throws SQLException {
        ee.ut.cs.esi.t2es2.services.ElectricitySupplierServiceImplService service = new ee.ut.cs.esi.t2es2.services.ElectricitySupplierServiceImplService();
        ee.ut.cs.esi.t2es2.services.ElectricitySupplierService port = service.getElectricitySupplierServiceImplPort();
        ee.ut.cs.esi.t2es2.services.AnnualConsumption annualConsumption = new ee.ut.cs.esi.t2es2.services.AnnualConsumption();
        ee.ut.cs.esi.t2es2.services.Client client = new ee.ut.cs.esi.t2es2.services.Client();

        //Check if Supplier Exists
        String message = null;
        AnnualConsumptionResponse response;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            connection = dbManager.getConnection();

            //Calculate and Get Consumed Energy from DB - for supplier per area per month
            String query = "select ID, startDate, endDate, userID, sum(exitPoint) as consumption from daily_metered_data group by year(startDate)";
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                try {
                    client.setId(Integer.parseInt(resultSet.getString("userID")));
                }
                catch(Exception e){
                    client.setId(401);
                }

                client.setName(name);
                client.setPhone(phone);
                client.setPostalAddress(postalAddress);

                GregorianCalendar startDateCalendar = new GregorianCalendar();
                startDateCalendar.setTime(formatter.parse(startDate));
                XMLGregorianCalendar xmlStartDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(startDateCalendar);

                client.setStartDate(xmlStartDate);

                GregorianCalendar endDateCalendar = new GregorianCalendar();
                endDateCalendar.setTime(formatter.parse(endDate));
                XMLGregorianCalendar xmlEndDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(endDateCalendar);

                client.setEndDate(xmlEndDate);

                annualConsumption.setMessageId(messageID);
                annualConsumption.setRelatedMessageId(String.valueOf(resultSet.getInt("ID")));

                GregorianCalendar sendTimeCalendar = new GregorianCalendar();
                sendTimeCalendar.setTime(resultSet.getDate("startDate"));
                XMLGregorianCalendar sendTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(sendTimeCalendar);

                annualConsumption.setSendTime(sendTime);

                annualConsumption.setClient(client);
                annualConsumption.setMessageRecipient("T2ES2");
                annualConsumption.setMessageSender("T2RK2");
                annualConsumption.setAnnualConsumption((double) resultSet.getFloat("consumption"));

                Boolean dataSent = false;

                try {
                    response = port.submitAnnualConsumptionReport(annualConsumption);
                    message = "Process Executed Successfully.";
                    dataSent = true;
                } catch (Exception e) {
                    Thread.sleep(15000);
                }

                if (!dataSent) {
                    try {
                        response = port.submitAnnualConsumptionReport(annualConsumption);
                        message = "Process Executed Successfully.";
                        dataSent = true;
                    } catch (Exception e) {
                        Thread.sleep(15000);
                    }
                }

                if (!dataSent) {
                    try {
                        response = port.submitAnnualConsumptionReport(annualConsumption);
                        message = "Process Executed Successfully..";
                        dataSent = true;
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
    




    public String submitBalanceInvoice(String messageID, String recipient, String date) throws ParseException, DatatypeConfigurationException, InterruptedException {
        ee.ut.cs.esi.t2es2.services.ElectricitySupplierServiceImplService service = new ee.ut.cs.esi.t2es2.services.ElectricitySupplierServiceImplService();
        ee.ut.cs.esi.t2es2.services.ElectricitySupplierService port = service.getElectricitySupplierServiceImplPort();

        ee.ut.cs.esi.t2es2.services.BalanceInvoice balanceInvoice = new ee.ut.cs.esi.t2es2.services.BalanceInvoice();

        balanceInvoice.setMessageId(messageID);
        balanceInvoice.setMessageRecipient(recipient);
        balanceInvoice.setMessageSender("T2RK2");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        GregorianCalendar timeStampCalendar = new GregorianCalendar();
        timeStampCalendar.setTime(formatter.parse(date));
        XMLGregorianCalendar timeStamp = DatatypeFactory.newInstance().newXMLGregorianCalendar(timeStampCalendar);

        balanceInvoice.setSendTime(timeStamp);

        Boolean dataSent = false;

        try {
            BalanceInvoiceResponse response = port.submitBalanceInvoice(balanceInvoice);
            return "Process Executed Successfully.";
        } catch (Exception e) {
            Thread.sleep(15000);
        }

        if (!dataSent) {
            try {
                BalanceInvoiceResponse response = port.submitBalanceInvoice(balanceInvoice);
                return "Process Executed Successfully.";
            } catch (Exception e) {
                Thread.sleep(15000);
            }
        }

        if (!dataSent) {
            try {
                BalanceInvoiceResponse response = port.submitBalanceInvoice(balanceInvoice);
                return "Process Executed Successfully.";
            } catch (Exception e) {
                return "Process cannot be completed.";
            }
        }

        return null;
    }

   
    
    
    
     
    
}
