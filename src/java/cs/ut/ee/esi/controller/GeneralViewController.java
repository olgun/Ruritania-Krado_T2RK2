/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cs.ut.ee.esi.controller;

import java.sql.SQLException;
import java.text.ParseException;
import javax.xml.datatype.DatatypeConfigurationException;
import org.project.t2rk2.T2ES1;
import org.project.t2rk2.T2ES2;
import org.project.t2rk2.T2NO1;
import org.project.t2rk2.T2NO2;

/**
 *
 * @author toshiba
 */
public class GeneralViewController {
    T2ES1 t2es1 = null;
    T2ES2 t2es2 = null;
    T2NO1 t2no1 = null;
    T2NO2 t2no2 = null;
    
    public GeneralViewController(){
        t2es1 = new T2ES1();
        t2es2 = new T2ES2();
        t2no1 = new T2NO1();
        t2no2 = new T2NO2();
    }

    public String sendConsumptionProfile(String supplierID) throws SQLException{
        return t2es1.sendConsumptionProfile(supplierID);
    }

    public String sendBalanceInvoice(String date, int value) throws InterruptedException{
        return t2es1.sendBalanceInvoice(date, value);
    }

    public String submitAnnualConsumptionReport(String messageID, String name, String phone, String postalAddress, String startDate, String endDate) throws SQLException{
        return t2es2.submitAnnualConsumptionReport(messageID, name, phone, postalAddress, startDate, endDate);

    }
    public String submitBalanceInvoice(String messageID, String recipient, String date) throws ParseException, DatatypeConfigurationException, InterruptedException{
        return t2es2.submitBalanceInvoice(messageID, recipient, date);
    }
    
    public String submitLoadProfile(String areaID, int lossConsumption) throws InterruptedException, SQLException{
        return t2no1.submitLoadProfile(areaID,lossConsumption);
     }

     public String submitQualitySeries(int seriesID, String date, Float value) throws DatatypeConfigurationException, InterruptedException, ParseException {
        return t2no1.submitQualitySeries(seriesID, date, value);
     }

     public String qualitySeries(String date, int value) throws ParseException, DatatypeConfigurationException, InterruptedException {
        return t2no2.qualitySeries(date, value);
     }

       public String loadProfile(String supplierID) throws SQLException {
            return t2no2.loadProfile(supplierID);
       }







}
