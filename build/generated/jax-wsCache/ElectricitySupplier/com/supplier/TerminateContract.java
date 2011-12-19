
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminateContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminateContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientTerminationMessage" type="{http://supplier.com/}clientTerminationMessage" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateContract", propOrder = {
    "clientTerminationMessage"
})
public class TerminateContract {

    @XmlElement(name = "ClientTerminationMessage", namespace = "http://supplier.com/")
    protected ClientTerminationMessage clientTerminationMessage;

    /**
     * Gets the value of the clientTerminationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTerminationMessage }
     *     
     */
    public ClientTerminationMessage getClientTerminationMessage() {
        return clientTerminationMessage;
    }

    /**
     * Sets the value of the clientTerminationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTerminationMessage }
     *     
     */
    public void setClientTerminationMessage(ClientTerminationMessage value) {
        this.clientTerminationMessage = value;
    }

}
