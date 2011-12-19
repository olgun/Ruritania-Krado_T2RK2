
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendConsumptionProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendConsumptionProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsumptionProfileMessage" type="{http://supplier.com/}consumptionProfileMessage" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendConsumptionProfile", propOrder = {
    "consumptionProfileMessage"
})
public class SendConsumptionProfile {

    @XmlElement(name = "ConsumptionProfileMessage", namespace = "http://supplier.com/")
    protected ConsumptionProfileMessage consumptionProfileMessage;

    /**
     * Gets the value of the consumptionProfileMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionProfileMessage }
     *     
     */
    public ConsumptionProfileMessage getConsumptionProfileMessage() {
        return consumptionProfileMessage;
    }

    /**
     * Sets the value of the consumptionProfileMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionProfileMessage }
     *     
     */
    public void setConsumptionProfileMessage(ConsumptionProfileMessage value) {
        this.consumptionProfileMessage = value;
    }

}
