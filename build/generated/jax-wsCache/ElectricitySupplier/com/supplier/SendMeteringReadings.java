
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendMeteringReadings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendMeteringReadings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeteringMessage" type="{http://supplier.com/}meteringMessage" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMeteringReadings", propOrder = {
    "meteringMessage"
})
public class SendMeteringReadings {

    @XmlElement(name = "MeteringMessage", namespace = "http://supplier.com/")
    protected MeteringMessage meteringMessage;

    /**
     * Gets the value of the meteringMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MeteringMessage }
     *     
     */
    public MeteringMessage getMeteringMessage() {
        return meteringMessage;
    }

    /**
     * Sets the value of the meteringMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringMessage }
     *     
     */
    public void setMeteringMessage(MeteringMessage value) {
        this.meteringMessage = value;
    }

}
