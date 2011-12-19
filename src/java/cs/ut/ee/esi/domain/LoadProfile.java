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
public class LoadProfile {
    
    public Integer loadProfile;
    public Date date;
    public Date hour;
    public Float hourlyValue;
    public NetworkOwner networkOwner;
    
    public LoadProfile()
    {
        networkOwner = new NetworkOwner();
    }

    /**
     * @return the loadProfile
     */
    public Integer getLoadProfile() {
        return loadProfile;
    }

    /**
     * @param loadProfile the loadProfile to set
     */
    public void setLoadProfile(Integer loadProfile) {
        this.loadProfile = loadProfile;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the hour
     */
    public Date getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(Date hour) {
        this.hour = hour;
    }

    /**
     * @return the hourlyValue
     */
    public Float getHourlyValue() {
        return hourlyValue;
    }

    /**
     * @param hourlyValue the hourlyValue to set
     */
    public void setHourlyValue(Float hourlyValue) {
        this.hourlyValue = hourlyValue;
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
