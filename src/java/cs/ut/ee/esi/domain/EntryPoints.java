package cs.ut.ee.esi.domain;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olgun
 */
public class EntryPoints {
    
 
    public Float providedEnergy;
   
    
    public ElectricitySupplier electricitySupplier;
    
    public EntryPoints()
    {
        electricitySupplier = new ElectricitySupplier();
    }

    /**
     * @return the providedEnergy
     */
    public Float getProvidedEnergy() {
        return providedEnergy;
    }

    /**
     * @param providedEnergy the providedEnergy to set
     */
    public void setProvidedEnergy(Float providedEnergy) {
        this.providedEnergy = providedEnergy;
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
