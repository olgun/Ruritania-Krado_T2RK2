/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.ut.ee.esi.domain;

/**
 *
 * @author Olgun
 */
public class ElectricitySupplier {
    
    public String electricitySupplierID;
    public String constraintArea;
    
    public ElectricitySupplier()
    {
    }

    /**
     * @return the electricitySupplierID
     */
    public String getElectricitySupplierID() {
        return electricitySupplierID;
    }

    /**
     * @param electricitySupplierID the electricitySupplierID to set
     */
    public void setElectricitySupplierID(String electricitySupplierID) {
        this.electricitySupplierID = electricitySupplierID;
    }

    /**
     * @return the constraintArea
     */
    public String getConstraintArea() {
        return constraintArea;
    }

    /**
     * @param constraintArea the constraintArea to set
     */
    public void setConstraintArea(String constraintArea) {
        this.constraintArea = constraintArea;
    }
    
}
