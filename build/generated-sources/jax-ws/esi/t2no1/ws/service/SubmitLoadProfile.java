
package esi.t2no1.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitLoadProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitLoadProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadProfileInput" type="{http://service.ws.t2no1.esi/}loadProfileInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitLoadProfile", propOrder = {
    "loadProfileInput"
})
public class SubmitLoadProfile {

    protected LoadProfileInput loadProfileInput;

    /**
     * Gets the value of the loadProfileInput property.
     * 
     * @return
     *     possible object is
     *     {@link LoadProfileInput }
     *     
     */
    public LoadProfileInput getLoadProfileInput() {
        return loadProfileInput;
    }

    /**
     * Sets the value of the loadProfileInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadProfileInput }
     *     
     */
    public void setLoadProfileInput(LoadProfileInput value) {
        this.loadProfileInput = value;
    }

}
