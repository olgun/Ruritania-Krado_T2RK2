package cs.ut.ee.esi.domain;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import cs.ut.ee.esi.domain.ExitPoints;
import cs.ut.ee.esi.domain.EntryPoints;
import java.util.Date;
import cs.ut.ee.esi.domain.NetworkOwner;
/**
 *
 * @author olgun
 */
public class MeteredData {
    
    public Date startDate;
    public Date endDate;
    
    public EntryPoints entryPoint;  
    public ExitPoints exitPoint;   
    
    public NetworkOwner networkOwner;
    
    public MeteredData()
    {
            entryPoint = new EntryPoints();  
            exitPoint = new ExitPoints();   
            networkOwner = new NetworkOwner();
    
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the entryPoint
     */
    public EntryPoints getEntryPoint() {
        return entryPoint;
    }

    /**
     * @param entryPoint the entryPoint to set
     */
    public void setEntryPoint(EntryPoints entryPoint) {
        this.entryPoint = entryPoint;
    }

    /**
     * @return the exitPoint
     */
    public ExitPoints getExitPoint() {
        return exitPoint;
    }

    /**
     * @param exitPoint the exitPoint to set
     */
    public void setExitPoint(ExitPoints exitPoint) {
        this.exitPoint = exitPoint;
    }

    /**
     * @return the networkOwner
     */
    public NetworkOwner getNetworkOwner() {
        return networkOwner;
    }

    /**
     * @param networkOwner the networkOwner to set
     */
    public void setNetworkOwner(NetworkOwner networkOwner) {
        this.networkOwner = networkOwner;
    }
    
    
}
