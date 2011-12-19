
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierChangeReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierChangeReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierChangeReplyMessage" type="{http://supplier.com/}supplierChangeReplyMessage" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierChangeReply", propOrder = {
    "supplierChangeReplyMessage"
})
public class SupplierChangeReply {

    @XmlElement(name = "SupplierChangeReplyMessage", namespace = "http://supplier.com/")
    protected SupplierChangeReplyMessage supplierChangeReplyMessage;

    /**
     * Gets the value of the supplierChangeReplyMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierChangeReplyMessage }
     *     
     */
    public SupplierChangeReplyMessage getSupplierChangeReplyMessage() {
        return supplierChangeReplyMessage;
    }

    /**
     * Sets the value of the supplierChangeReplyMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierChangeReplyMessage }
     *     
     */
    public void setSupplierChangeReplyMessage(SupplierChangeReplyMessage value) {
        this.supplierChangeReplyMessage = value;
    }

}
