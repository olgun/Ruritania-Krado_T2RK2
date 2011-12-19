/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.ut.ee.esi.domain;

import java.util.Date;

/**
 *
 * @author Olgun
 */
public class ConsumptionPlan {
    
    public Float consumptionValue;
    public Date planDate;
    public ElectricitySupplier electricitySupplier;
    
    public ConsumptionPlan()
    {
        electricitySupplier = new ElectricitySupplier();
    }

    /**
     * @return the consumptionValue
     */
    public Float getConsumptionValue() {
        return consumptionValue;
    }

    /**
     * @param consumptionValue the consumptionValue to set
     */
    public void setConsumptionValue(Float consumptionValue) {
        this.consumptionValue = consumptionValue;
    }

    /**
     * @return the planDate
     */
    public Date getPlanDate() {
        return planDate;
    }

    /**
     * @param planDate the planDate to set
     */
    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
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

   
    
}
