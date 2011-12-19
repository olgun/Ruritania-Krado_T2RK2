/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.project.t2rk2;

import cs.ut.ee.esi.manager.DataSourceManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Olgun
 */
public class T2ES1 {

    DataSourceManager dbManager = DataSourceManager.getDataSourceManagerInstance();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public String sendBalanceInvoice(String date, int value) throws InterruptedException {
        com.supplier.ElectricitySupplier_Service service = new com.supplier.ElectricitySupplier_Service();
        com.supplier.ElectricitySupplier port = service.getElectricitySupplierPort();
        com.supplier.BalanceInvoiceMessage balanceInvoiceMessage = new com.supplier.BalanceInvoiceMessage();

        balanceInvoiceMessage.setDate(date);
        balanceInvoiceMessage.setValue(value);

        Boolean success = false;

        try {
            port.sendBalanceInvoice(balanceInvoiceMessage);
            return " Process Executed Successfully.";
        } catch (Exception e) {
            Thread.sleep(20000);
        }

        if (!success) {
            try {
                port.sendBalanceInvoice(balanceInvoiceMessage);
                return "Process Executed Successfully on re-attempt.";
            } catch (Exception e) {
                Thread.sleep(20000);
            }
        }

        if (!success) {
            try {
                port.sendBalanceInvoice(balanceInvoiceMessage);
                return "Process Executed Successfully";
            } catch (Exception e) {
                return "Process cannot be completed";
            }
        }

        return null;
    }

    public String sendConsumptionProfile(String supplierID) throws SQLException {
        com.supplier.ElectricitySupplier_Service service = new com.supplier.ElectricitySupplier_Service();
        com.supplier.ElectricitySupplier port = service.getElectricitySupplierPort();
        com.supplier.ConsumptionProfileMessage consumptionProfileMessage = new com.supplier.ConsumptionProfileMessage();

        //Check if Supplier Exists
        String message = null;
        
        try {
            connection = dbManager.getConnection();

            String sql = "SELECT COUNT(*) FROM daily_metered_data where electricitySupplierID = '" + supplierID + "'";

            statement = (Statement) connection.createStatement();
            resultSet= statement.executeQuery(sql);

            if (resultSet == null) {
                return "Process cannot be completed. ID does not exist.";
            }
            else if(resultSet.next()) {
                if(resultSet.getInt(1) == 0)
                    return "Process cannot be completed. ID does not exist.";
            }

            //Calculate and Get Consumed Energy from DB - for supplier per area per month
            String query = "select electricitySupplierID, startDate, endDate, sum(exitPoint) as consumption from daily_metered_data group by electricitySupplierID, startDate, endDate";
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                consumptionProfileMessage.setDate(resultSet.getDate("startDate").toString());
                consumptionProfileMessage.setValue((int) resultSet.getFloat("consumption"));

                Boolean success = false;

                try {
                    port.sendConsumptionProfile(consumptionProfileMessage);
                    message = "Process Executed successfully.";
                    success = true;
                } catch (Exception e) {
                    Thread.sleep(20000);
                }

                if (!success) {
                    try {
                        port.sendConsumptionProfile(consumptionProfileMessage);
                        message = "Process Executed successfully.";
                        success = true;
                    } catch (Exception e) {
                        Thread.sleep(20000);
                    }
                }

                if (!success) {
                    try {
                        port.sendConsumptionProfile(consumptionProfileMessage);
                        message = "Process executed successfully on re-attempt.";
                        success = true;
                    } catch (Exception e) {
                       message = "Process cannot be completed.";
                    }
                }
            }

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
