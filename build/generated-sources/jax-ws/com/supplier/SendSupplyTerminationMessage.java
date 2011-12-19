
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendSupplyTerminationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendSupplyTerminationMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplyTerminationMessage" type="{http://supplier.com/}supplyTerminationMessage" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendSupplyTerminationMessage", propOrder = {
    "supplyTerminationMessage"
})
public class SendSupplyTerminationMessage {

    @XmlElement(name = "SupplyTerminationMessage", namespace = "http://supplier.com/")
    protected SupplyTerminationMessage supplyTerminationMessage;

    /**
     * Gets the value of the supplyTerminationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyTerminationMessage }
     *     
     */
    public SupplyTerminationMessage getSupplyTerminationMessage() {
        return supplyTerminationMessage;
    }

    /**
     * Sets the value of the supplyTerminationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyTerminationMessage }
     *     
     */
    public void setSupplyTerminationMessage(SupplyTerminationMessage value) {
        this.supplyTerminationMessage = value;
    }

}
