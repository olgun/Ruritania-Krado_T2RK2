
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendBalanceInvoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendBalanceInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceInvoiceMessage" type="{http://supplier.com/}balanceInvoiceMessage" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendBalanceInvoice", propOrder = {
    "balanceInvoiceMessage"
})
public class SendBalanceInvoice {

    @XmlElement(name = "BalanceInvoiceMessage", namespace = "http://supplier.com/")
    protected BalanceInvoiceMessage balanceInvoiceMessage;

    /**
     * Gets the value of the balanceInvoiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInvoiceMessage }
     *     
     */
    public BalanceInvoiceMessage getBalanceInvoiceMessage() {
        return balanceInvoiceMessage;
    }

    /**
     * Sets the value of the balanceInvoiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInvoiceMessage }
     *     
     */
    public void setBalanceInvoiceMessage(BalanceInvoiceMessage value) {
        this.balanceInvoiceMessage = value;
    }

}
