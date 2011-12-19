/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cs.ut.ee.esi.controller;

import cs.ut.ee.esi.manager.T2RK2Manager;
import java.sql.SQLException;
import java.util.List;
import cs.ut.ee.esi.domain.ConsumptionForecast;
import cs.ut.ee.esi.domain.ConsumptionPlan;
import cs.ut.ee.esi.domain.LoadProfile;
import cs.ut.ee.esi.domain.LoadProfileShares;
import cs.ut.ee.esi.domain.MeteredData;

/**
 *
 * @author toshiba
 */
public class T2RK2ModelAndViewController {


     public List<ConsumptionPlan> getConsumptionPlanForDisplay() throws SQLException {
       return new T2RK2Manager().getConsumptionPlanForDisplay();
    }

    public List<ConsumptionForecast> getConsumptionForecastForDisplay() throws SQLException {
       return new T2RK2Manager().getConsumptionForecastForDisplay();
    }

    public List<MeteredData> getDailyMeteredDataForDisplay() throws SQLException {
          return new T2RK2Manager().getDailyMeteredDataForDisplay();
    }

     public List<LoadProfile> getLoadProfileForDisplay() throws SQLException {
        return new T2RK2Manager().getLoadProfileForDisplay();
    }

    public List<LoadProfileShares> getLoadProfileShareForDisplay() throws SQLException {
         return new T2RK2Manager().getLoadProfileShareForDisplay();
    }


}
