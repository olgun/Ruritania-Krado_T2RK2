/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.ut.ee.esi.domain;

/**
 *
 * @author Olgun
 */
public class BalanceProvider {
    
    public String balanceProviderID;
    public String constraintAreaID;

    public BalanceProvider() {
    
    }

    /**
     * @return the balanceProviderID
     */
    public String getBalanceProviderID() {
        return balanceProviderID;
    }

    /**
     * @param balanceProviderID the balanceProviderID to set
     */
    public void setBalanceProviderID(String balanceProviderID) {
        this.balanceProviderID = balanceProviderID;
    }

    /**
     * @return the constraintAreaID
     */
    public String getConstraintAreaID() {
        return constraintAreaID;
    }

    /**
     * @param constraintAreaID the constraintAreaID to set
     */
    public void setConstraintAreaID(String constraintAreaID) {
        this.constraintAreaID = constraintAreaID;
    }
    
}
