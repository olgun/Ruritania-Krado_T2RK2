/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.ut.ee.esi.domain;

/**
 *
 * @author toshiba
 */
public class AnnualConsumption {
    
   
int supplierID;    
double annualConsumption;
String messageID;
String messageReciepent;
String relatedMessageİd;

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }


 


public double getAnnualConsumption() {
        return annualConsumption;
    }

    public void setAnnualConsumption(double annualConsumption) {
        this.annualConsumption = annualConsumption;
    }

    public String getMessageReciepent() {
        return messageReciepent;
    }

    public void setMessageReciepent(String messageReciepent) {
        this.messageReciepent = messageReciepent;
    }

       public String getRelatedMessageİd() {
        return relatedMessageİd;
    }

    public void setRelatedMessageİd(String relatedMessageİd) {
        this.relatedMessageİd = relatedMessageİd;
    }




}
