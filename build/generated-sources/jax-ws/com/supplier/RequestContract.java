
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientRegistrationMessage" type="{http://supplier.com/}clientRegistrationMessage" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestContract", propOrder = {
    "clientRegistrationMessage"
})
public class RequestContract {

    @XmlElement(name = "ClientRegistrationMessage", namespace = "http://supplier.com/")
    protected ClientRegistrationMessage clientRegistrationMessage;

    /**
     * Gets the value of the clientRegistrationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ClientRegistrationMessage }
     *     
     */
    public ClientRegistrationMessage getClientRegistrationMessage() {
        return clientRegistrationMessage;
    }

    /**
     * Sets the value of the clientRegistrationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientRegistrationMessage }
     *     
     */
    public void setClientRegistrationMessage(ClientRegistrationMessage value) {
        this.clientRegistrationMessage = value;
    }

}
