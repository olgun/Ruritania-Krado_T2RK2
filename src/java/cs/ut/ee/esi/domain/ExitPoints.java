package cs.ut.ee.esi.domain;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olgun
 */
public class ExitPoints {
    
    public String userID;
    public Float usedEnergy;
    
    public ExitPoints()
    {
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the usedEnergy
     */
    public Float getUsedEnergy() {
        return usedEnergy;
    }

    /**
     * @param usedEnergy the usedEnergy to set
     */
    public void setUsedEnergy(Float usedEnergy) {
        this.usedEnergy = usedEnergy;
    }
}
