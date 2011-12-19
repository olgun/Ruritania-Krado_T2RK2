package cs.ut.ee.esi.domain;

import java.util.Date;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olgun
 */
public class ConsumptionForecast {
    
    public Float predictedConsumption;
    public ElectricitySupplier electricitySupplier;
    ConsumptionForecast consumptionForecast;
    public Date forecastDate;
    
    public ConsumptionForecast()
    {
        electricitySupplier = new ElectricitySupplier();
    }

    /**
     * @return the predictedConsumption
     */
    public Float getPredictedConsumption() {
        return predictedConsumption;
    }

    /**
     * @param predictedConsumption the predictedConsumption to set
     */
    public void setPredictedConsumption(Float predictedConsumption) {
        this.predictedConsumption = predictedConsumption;
    }

    /**
     * @return the electricitySupplier
     */
    public ElectricitySupplier getElectricitySupplier() {
        return electricitySupplier;
    }

    /**
     * @param electricitySupplier the electricitySupplier to set
     */
    public void setElectricitySupplier(ElectricitySupplier electricitySupplier) {
        this.electricitySupplier = electricitySupplier;
    }

    /**
     * @return the forecastDate
     */
    public Date getForecastDate() {
        return forecastDate;
    }

    /**
     * @param forecastDate the forecastDate to set
     */
    public void setForecastDate(Date forecastDate) {
        this.forecastDate = forecastDate;
    }

  
}
