package cs.ut.ee.esi.domain;


import java.util.Date;
import cs.ut.ee.esi.domain.BalanceProvider;
import cs.ut.ee.esi.domain.ElectricitySupplier;
import cs.ut.ee.esi.domain.NetworkOwner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olgun
 */
public class LoadProfileShares {
    
    
    public NetworkOwner networkOwner;
    public ElectricitySupplier electricitySupplier;
    public BalanceProvider balanceProvider;
    public String profileSettlementAreaID;
    public String calculationStage;
    public Date supplyMonth;
    public Float lowLoadProfileShare;
    public Float highLoadProfileShare;
    
    public LoadProfileShares()
    {
        electricitySupplier = new ElectricitySupplier();
        balanceProvider = new BalanceProvider();
        networkOwner = new NetworkOwner();
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
     * @return the balanceProvider
     */
    public BalanceProvider getBalanceProvider() {
        return balanceProvider;
    }

    /**
     * @param balanceProvider the balanceProvider to set
     */
    public void setBalanceProvider(BalanceProvider balanceProvider) {
        this.balanceProvider = balanceProvider;
    }

    /**
     * @return the profileSettlementAreaID
     */
    public String getProfileSettlementAreaID() {
        return profileSettlementAreaID;
    }

    /**
     * @param profileSettlementAreaID the profileSettlementAreaID to set
     */
    public void setProfileSettlementAreaID(String profileSettlementAreaID) {
        this.profileSettlementAreaID = profileSettlementAreaID;
    }

    /**
     * @return the calculationStage
     */
    public String getCalculationStage() {
        return calculationStage;
    }

    /**
     * @param calculationStage the calculationStage to set
     */
    public void setCalculationStage(String calculationStage) {
        this.calculationStage = calculationStage;
    }

    /**
     * @return the supplyMonth
     */
    public Date getSupplyMonth() {
        return supplyMonth;
    }

    /**
     * @param supplyMonth the supplyMonth to set
     */
    public void setSupplyMonth(Date supplyMonth) {
        this.supplyMonth = supplyMonth;
    }

    /**
     * @return the lowLoadProfileShare
     */
    public Float getLowLoadProfileShare() {
        return lowLoadProfileShare;
    }

    /**
     * @param lowLoadProfileShare the lowLoadProfileShare to set
     */
    public void setLowLoadProfileShare(Float lowLoadProfileShare) {
        this.lowLoadProfileShare = lowLoadProfileShare;
    }

    /**
     * @return the highLoadProfileShare
     */
    public Float getHighLoadProfileShare() {
        return highLoadProfileShare;
    }

    /**
     * @param highLoadProfileShare the highLoadProfileShare to set
     */
    public void setHighLoadProfileShare(Float highLoadProfileShare) {
        this.highLoadProfileShare = highLoadProfileShare;
    }
}
