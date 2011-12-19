
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestInvoices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestInvoices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestInvoicesMessage" type="{http://supplier.com/}requestInvoicesMessage" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestInvoices", propOrder = {
    "requestInvoicesMessage"
})
public class RequestInvoices {

    @XmlElement(name = "RequestInvoicesMessage", namespace = "http://supplier.com/")
    protected RequestInvoicesMessage requestInvoicesMessage;

    /**
     * Gets the value of the requestInvoicesMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RequestInvoicesMessage }
     *     
     */
    public RequestInvoicesMessage getRequestInvoicesMessage() {
        return requestInvoicesMessage;
    }

    /**
     * Sets the value of the requestInvoicesMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestInvoicesMessage }
     *     
     */
    public void setRequestInvoicesMessage(RequestInvoicesMessage value) {
        this.requestInvoicesMessage = value;
    }

}
