/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.project.t2rk2;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sina
 */
@WebService(serviceName = "T2RK2")
public class T2RK2 {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "getQualitySeries")
    public QualitySeries getQualitySeries() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getInvoiceBalance")
    public InvoiceBalance getInvoiceBalance(@WebParam(name = "supplierID") int supplierID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getConsumptionProfile")
    public ConsumptionProfile getConsumptionProfile(@WebParam(name = "supplierID") int supplierID) {
        //TODO write your implementation code here:
        return null;
    }
}
