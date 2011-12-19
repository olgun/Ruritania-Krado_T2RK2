/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.project.t2rk2;


import cs.ut.ee.esi.domain.EntryPoints;
import cs.ut.ee.esi.domain.MeteredData;
import cs.ut.ee.esi.domain.ConsumptionPlan;
import cs.ut.ee.esi.domain.LoadProfile;
import cs.ut.ee.esi.domain.BalanceProvider;
import cs.ut.ee.esi.domain.ElectricitySupplier;
import cs.ut.ee.esi.domain.ExitPoints;
import cs.ut.ee.esi.domain.ConsumptionForecast;
import cs.ut.ee.esi.domain.NetworkOwner;
import cs.ut.ee.esi.domain.LoadProfileShares;
import java.text.ParseException;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Olgun
 */
@WebService(serviceName = "T2RK2")
public class T2RK2 {
    
    
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "esi_cakabey";
    String driver = "com.mysql.jdbc.Driver";
    String userName = "cakabey";
    String password = "Zbgz62yR";
    
    private void openDBConnection() throws ClassNotFoundException, SQLException,
             InstantiationException, IllegalAccessException {
            Class.forName(this.driver).newInstance();
            this.conn = DriverManager.getConnection(this.url + this.dbName, this.userName, this.password);
    }
    
    private void closeDBConnection() throws SQLException{
        this.conn.close();
    }

    
       

       
    /**
     * Web service operation
     */
    @WebMethod(operationName = "saveMeteredData")
    public String saveMeteredData(@WebParam(name = "startDate") String startDate, 
    @WebParam(name = "endDate") String endDate, 
    @WebParam(name = "entryPoint") String entryPoint, 
    @WebParam(name = "exitPoint") String exitPoint, 
    @WebParam(name = "networkOwnerID") String networkOwnerID, 
    @WebParam(name = "electricitySupplierID") String electricitySupplierID, 
    @WebParam(name = "userID") String userID,
    @WebParam(name = "constraintAreaID") String constraintAreaID) throws ParseException {
        //TODO write your implementation code here
        
        String message = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //Parse Input Parameters
        NetworkOwner owner = new NetworkOwner();
        owner.setNetworkOwnerID(networkOwnerID);
        owner.setConstraintAreaID(constraintAreaID);

        ElectricitySupplier supplier = new ElectricitySupplier();
        supplier.setElectricitySupplierID(electricitySupplierID);

        MeteredData data = new MeteredData();
        data.setStartDate(formatter.parse(startDate));
        data.setEndDate(formatter.parse(endDate));
        data.setNetworkOwner(owner);

        data.setEntryPoint(new EntryPoints());
        data.getEntryPoint().setElectricitySupplier(supplier);
        data.getEntryPoint().setProvidedEnergy(new Float(entryPoint));

        data.setExitPoint(new ExitPoints());
        data.getExitPoint().setUserID(userID);
        data.getExitPoint().setUsedEnergy(new Float(exitPoint));

        //Store in Database
        try {
            openDBConnection();

            PreparedStatement statement = this.conn.prepareStatement("insert into daily_metered_data"
                    + "(networkOwnerID, startDate, endDate, exitPoint,  entryPoint) "
                    + "VALUES(?, ?, ?, ?, ?)");
            statement.setString(1, owner.getNetworkOwnerID());
            statement.setDate(2, new Date(data.getStartDate().getTime()));
            statement.setDate(3, new Date(data.getStartDate().getTime()));
            statement.setFloat(4, data.getExitPoint().getUsedEnergy());
            statement.setFloat(5, data.getEntryPoint().getProvidedEnergy());
            
            statement.executeUpdate();
            
            message = "Daily Metered Data has been updated successfully.";

            closeDBConnection();
        }
        catch (SQLException s){
            return "Daily Metered Data cannot be updated";
        }
        catch(Exception e) {
        }

        return message;
    }
        

   
  

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saveLoadProfileShare")
    public String saveLoadProfileShare(@WebParam(name = "networkOwnerID") String networkOwnerID, 
    @WebParam(name = "electricitySupplierID") String electricitySupplierID, 
    @WebParam(name = "balanceProviderID") String balanceProviderID, 
    @WebParam(name = "profileSettlementAreaID") String profileSettlementAreaID, 
    @WebParam(name = "calculationStage") String calculationStage, 
    @WebParam(name = "supplyMonth") String supplyMonth, 
    @WebParam(name = "highLoadProfileShare") String highLoadProfileShare, 
    @WebParam(name = "lowLoadProfileShare") String lowLoadProfileShare) throws ParseException {
        //TODO write your implementation code here:
        String message = null;
        
        if((electricitySupplierID != null) && (balanceProviderID != null))
            return "T2RK2 can not process for the values provided.";

        if((!calculationStage.toLowerCase().equals("preliminary")) && (!calculationStage.toLowerCase().equals("final")))
            return "Invalid Value.";
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        LoadProfileShares loadProfileShare = new LoadProfileShares();

        NetworkOwner owner = new NetworkOwner();
        owner.setNetworkOwnerID(networkOwnerID);

        loadProfileShare.setNetworkOwner(owner);

        ElectricitySupplier supplier = new ElectricitySupplier();
        supplier.setElectricitySupplierID(electricitySupplierID);

        loadProfileShare.setElectricitySupplier(supplier);

        BalanceProvider provider = new BalanceProvider();
        provider.setBalanceProviderID(balanceProviderID);

        loadProfileShare.setBalanceProvider(provider);

        loadProfileShare.setProfileSettlementAreaID(profileSettlementAreaID);
        loadProfileShare.setCalculationStage(calculationStage.toLowerCase());
        loadProfileShare.setSupplyMonth(formatter.parse(supplyMonth));
        loadProfileShare.setHighLoadProfileShare(new Float(highLoadProfileShare));
        loadProfileShare.setLowLoadProfileShare(new Float(lowLoadProfileShare));

        //Store in Database
        try {
            openDBConnection();

            PreparedStatement statement = null;

            if(electricitySupplierID != null){
                statement = this.conn.prepareStatement("insert into load_profile_share"
                    + "(networkOwnerID, electricitySupplierID, profileSettlementAreaID, calculationStage, supplyMonth, highLoadShare, lowLoadShare) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?)");
                statement.setString(1, loadProfileShare.getNetworkOwner().getNetworkOwnerID());
                statement.setString(2, loadProfileShare.getElectricitySupplier().getElectricitySupplierID());
                statement.setString(3, loadProfileShare.getProfileSettlementAreaID());
                statement.setString(4, loadProfileShare.getCalculationStage());
                statement.setDate(5, new Date(loadProfileShare.getSupplyMonth().getTime()));
                statement.setFloat(6, loadProfileShare.getHighLoadProfileShare());
                statement.setFloat(7, loadProfileShare.getLowLoadProfileShare());
            }
            else if(balanceProviderID != null)
            {
                statement = this.conn.prepareStatement("insert into load_profile_share"
                    + "(networkOwnerID, balanceProviderID, profileSettlementAreaID, calculationStage, supplyMonth, highLoadShare, lowLoadShare) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?)");
                statement.setString(1, loadProfileShare.getNetworkOwner().getNetworkOwnerID());
                statement.setString(2, loadProfileShare.getBalanceProvider().getBalanceProviderID());
                statement.setString(3, loadProfileShare.getProfileSettlementAreaID());
                statement.setString(4, loadProfileShare.getCalculationStage());
                statement.setDate(5, new Date(loadProfileShare.getSupplyMonth().getTime()));
                statement.setFloat(6, loadProfileShare.getHighLoadProfileShare());
                statement.setFloat(7, loadProfileShare.getLowLoadProfileShare());
            }

            statement.executeUpdate();

            message = "Load Profile Share updated successfully.";

            closeDBConnection();
        }
        catch (SQLException s){
            return "Load Profile cannot be updated";
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return message;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saveConsumptionForecast")
    public String saveConsumptionForecast(@WebParam(name = "predictedConsumption") String predictedConsumption, 
    @WebParam(name = "electricitySupplierID") String electricitySupplierID, 
    @WebParam(name = "date") String date) throws ParseException {
        //TODO write your implementation code here:
        String message = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ConsumptionForecast forecast = new ConsumptionForecast();

        forecast.setPredictedConsumption(new Float(predictedConsumption));
        forecast.setForecastDate(formatter.parse(date));

        ElectricitySupplier supplier = new ElectricitySupplier();
        supplier.setElectricitySupplierID(electricitySupplierID);
        forecast.setElectricitySupplier(supplier);

        //Store in Database
        try {
            openDBConnection();

            PreparedStatement statement = this.conn.prepareStatement("insert into consumption_forecast"
                    + "(electricitySupplierID, dated, predictedConsumption) "
                    + "VALUES(?, ?, ?)");
            statement.setString(1, forecast.getElectricitySupplier().getElectricitySupplierID());
            statement.setDate(2, new Date(forecast.getForecastDate().getTime()));
            statement.setFloat(3, forecast.getPredictedConsumption());

            statement.executeUpdate();

            message = "Consumption Forecast updated successfully.";

            closeDBConnection();
        }
        catch (SQLException s){
            return "Consumption Forecast cannot be updated";
        }
        catch(Exception e) {
        }

        return message;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saveConsumptionPlan")
    public String saveConsumptionPlan(@WebParam(name = "date") String date, 
    @WebParam(name = "electricitySupplierID") String electricitySupplierID, 
    @WebParam(name = "consumptionValue") String consumptionValue) throws ParseException {
        //TODO write your implementation code here:
        String message = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ConsumptionPlan plan = new ConsumptionPlan();

        plan.setConsumptionValue(new Float(consumptionValue));
        plan.setPlanDate(formatter.parse(date));

        ElectricitySupplier supplier = new ElectricitySupplier();
        supplier.setElectricitySupplierID(electricitySupplierID);
        plan.setElectricitySupplier(supplier);

        //Store in Database
        try {
            openDBConnection();

            PreparedStatement statement = this.conn.prepareStatement("insert into consumption_plan"
                    + "(electricitySupplierID, dated, consumptionValue) "
                    + "VALUES(?, ?, ?)");
            statement.setString(1, plan.getElectricitySupplier().getElectricitySupplierID());
            statement.setDate(2, new Date(plan.getPlanDate().getTime()));
            statement.setFloat(3, plan.getConsumptionValue());

            statement.executeUpdate();

            message = "Consumption Plan updated successfully.";

            closeDBConnection();
        }
        catch (SQLException s){
            return "Consumption Plan cannot be updated";
        }
        catch(Exception e) {
        }

        return message;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saveLoadProfile")
    public String saveLoadProfile(@WebParam(name = "date") String date, 
    @WebParam(name = "hour") String hour, 
    @WebParam(name = "hourlyValue") String hourlyValue, 
    @WebParam(name = "networkOwnerID") String networkOwnerID) throws ParseException {
        //TODO write your implementation code here:
        String message = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        LoadProfile loadProfile = new LoadProfile();

        NetworkOwner owner = new NetworkOwner();
        owner.setNetworkOwnerID(networkOwnerID);

        loadProfile.setNetworkOwner(owner);
        loadProfile.setHourlyValue(new Float(hourlyValue));
        loadProfile.setHour(formatter.parse(hour));
        loadProfile.setDate(formatter.parse(date));

        //Store in Database
        try {
            openDBConnection();

            PreparedStatement statement = this.conn.prepareStatement("insert into load_profile"
                    + "(networkOwnerID, dated, hour, hourlyLoad) "
                    + "VALUES(?, ?, ?, ?)");
            statement.setString(1, loadProfile.getNetworkOwner().getNetworkOwnerID());
            statement.setDate(2, new Date(loadProfile.getDate().getTime()));
            statement.setDate(3, new Date(loadProfile.getHour().getTime()));
            statement.setFloat(4, loadProfile.getHourlyValue());

            statement.executeUpdate();

            message = "Load Profile updated successfully.";

            closeDBConnection();
        }
        catch (SQLException s){
            return "Load Profile cannot be updated.";
        }
        catch(Exception e) {
        }

        return message;
    }

  

    
}
