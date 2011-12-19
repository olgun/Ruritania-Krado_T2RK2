/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cs.ut.ee.esi.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cs.ut.ee.esi.domain.ConsumptionForecast;
import cs.ut.ee.esi.domain.ConsumptionPlan;
import cs.ut.ee.esi.domain.EntryPoints;
import cs.ut.ee.esi.domain.ExitPoints;
import cs.ut.ee.esi.domain.LoadProfile;
import cs.ut.ee.esi.domain.LoadProfileShares;
import cs.ut.ee.esi.domain.MeteredData;

/**
 *
 * @author Olgun
 */
public class T2RK2Manager {
 DataSourceManager dbManager;
  Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    
 public T2RK2Manager(){
     dbManager = DataSourceManager.getDataSourceManagerInstance();
    }
    
    public List<ConsumptionPlan> getConsumptionPlanForDisplay() throws SQLException {
        List<ConsumptionPlan> consumptionPlan = new ArrayList<ConsumptionPlan>();
         try {
            connection = dbManager.getConnection();
            String query = "select electricitySupplierID, dated, consumptionValue from consumption_plan";
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(query);
            ConsumptionPlan cp = null;
            while (resultSet.next()) {
                cp = new ConsumptionPlan();
                cp.getElectricitySupplier().setElectricitySupplierID(resultSet.getString("electricitySupplierID"));
                cp.setPlanDate(resultSet.getDate("dated"));
                cp.setConsumptionValue(resultSet.getFloat("consumptionValue"));
                consumptionPlan.add(cp);
            }

return consumptionPlan;
        } catch (SQLException s) {
        } catch (Exception e) {
        } finally {
            if (statement != null) {
              //  resultSet.close();
              //  statement.close();
              //  connection.close();

            }
        }

        return null;
    }



    public List<ConsumptionForecast> getConsumptionForecastForDisplay() throws SQLException {
        List<ConsumptionForecast> consumptionForecast = new ArrayList<ConsumptionForecast>();
            try {
            connection = dbManager.getConnection();
            String query = "select electricitySupplierID, dated, predictedConsumption from consumption_forecast";
            statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            ConsumptionForecast cf;
            while (resultSet.next()) {
                cf = new ConsumptionForecast();

                cf.getElectricitySupplier().setElectricitySupplierID(resultSet.getString("electricitySupplierID"));
                cf.setForecastDate(resultSet.getDate("dated"));
                cf.setPredictedConsumption(resultSet.getFloat("predictedConsumption"));
                consumptionForecast.add(cf); // add to lıst
            }
        return consumptionForecast;
        } catch (SQLException s) {
        } catch (Exception e) {
        } finally {
            if (statement != null) {
              //  resultSet.close();
               // statement.close();
              //  connection.close();
            }
        }

        return null;
    }


    public List<MeteredData> getDailyMeteredDataForDisplay() throws SQLException {
        List<MeteredData> meteredData = new ArrayList<MeteredData>();
       try {
            connection = dbManager.getConnection();

            String query = "select * from daily_metered_data";
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(query);
            MeteredData md = null;
            while (resultSet.next()) {
                md = new MeteredData();

                md.getNetworkOwner().setNetworkOwnerID(resultSet.getString("networkOwnerID"));
                md.setStartDate(resultSet.getDate("startDate"));
                md.setEndDate(resultSet.getDate("endDate"));
                ExitPoints exitPoint = new ExitPoints();
                //exitPoint.setUserID(resultSet.getString("userID"));
                exitPoint.setUsedEnergy(resultSet.getFloat("exitPoint"));
                md.setExitPoint(exitPoint);

                EntryPoints entryPoint = new EntryPoints();
                //entryPoint.getElectricitySupplier().setElectricitySupplierID(resultSet.getString("electricitySupplierID"));
                entryPoint.setProvidedEnergy(resultSet.getFloat("entryPoint"));
                md.setEntryPoint(entryPoint);
                meteredData.add(md);

            }
            return meteredData;
        } catch (SQLException s) {
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
           //    resultSet.close();
           //    connection.close();
           //    statement.close();
            }
        }

        return null;
        
    }



    public List<LoadProfile> getLoadProfileForDisplay() throws SQLException {
        List<LoadProfile> loadProfile = new ArrayList<LoadProfile>();

        try {
            connection = dbManager.getConnection();
            String query = "select networkOwnerID, dated, hour, hourlyLoad from load_Profile";
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(query);
            LoadProfile lp;
            while (resultSet.next()) {
                lp = new LoadProfile();

                lp.getNetworkOwner().setNetworkOwnerID(resultSet.getString("networkOwnerID"));
                lp.setDate(resultSet.getDate("dated"));
                lp.setHour(resultSet.getDate("hour"));
                lp.setHourlyValue(resultSet.getFloat("hourlyLoad"));

                loadProfile.add(lp);
            }
            return loadProfile;
        } catch (SQLException s) {
        } catch (Exception e) {
        } finally {
            if (statement != null) {
          //      statement.close();
          //      resultSet.close();
          //      connection.close();
            }
        }

        return null;
    }


    public List<LoadProfileShares> getLoadProfileShareForDisplay() throws SQLException {
        List<LoadProfileShares> loadProfileShares = new ArrayList<LoadProfileShares>();
        try {
            connection = dbManager.getConnection();

            String query = "select networkOwnerID, electricitySupplierID, balanceProviderID, profileSettlementAreaID, calculationStage, supplyMonth, highLoadShare, lowLoadShare from load_profile_share";
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(query);
            LoadProfileShares lps = null;
            while (resultSet.next()) {
                lps = new LoadProfileShares();

                lps.getNetworkOwner().setNetworkOwnerID(resultSet.getString("networkOwnerID"));
                lps.getElectricitySupplier().setElectricitySupplierID(resultSet.getString("electricitySupplierID"));
                lps.getBalanceProvider().setBalanceProviderID(resultSet.getString("balanceProviderID"));
                lps.setProfileSettlementAreaID(resultSet.getString("profileSettlementAreaID"));
                lps.setCalculationStage(resultSet.getString("calculationStage"));
                lps.setSupplyMonth(resultSet.getDate("supplyMonth"));
                lps.setHighLoadProfileShare(resultSet.getFloat("highLoadShare"));
                lps.setLowLoadProfileShare(resultSet.getFloat("lowLoadShare"));

                loadProfileShares.add(lps);

            }
               return loadProfileShares;
        } catch (SQLException s) {
        } catch (Exception e) {
        } finally {
            if (statement != null) {
             //   statement.close();
             //   resultSet.close();
             //   connection.close();

            }
        }

         return null;
    }




}
