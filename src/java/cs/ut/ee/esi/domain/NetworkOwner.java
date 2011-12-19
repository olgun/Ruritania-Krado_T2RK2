/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.ut.ee.esi.domain;

/**
 *
 * @author Olgun
 */
public class NetworkOwner {
    
    public String networkOwnerID;
    public String constraintAreaID;
    
    public NetworkOwner()
    {
    }

    /**
     * @return the networkOwnerID
     */
    public String getNetworkOwnerID() {
        return networkOwnerID;
    }

    /**
     * @param networkOwnerID the networkOwnerID to set
     */
    public void setNetworkOwnerID(String networkOwnerID) {
        this.networkOwnerID = networkOwnerID;
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
