
package esi.t2no1.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadProfileInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadProfileInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.t2no1.esi/}messageBase">
 *       &lt;sequence>
 *         &lt;element name="loadProfile" type="{http://service.ws.t2no1.esi/}loadProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadProfileInput", propOrder = {
    "loadProfile"
})
public class LoadProfileInput
    extends MessageBase
{

    protected LoadProfile loadProfile;

    /**
     * Gets the value of the loadProfile property.
     * 
     * @return
     *     possible object is
     *     {@link LoadProfile }
     *     
     */
    public LoadProfile getLoadProfile() {
        return loadProfile;
    }

    /**
     * Sets the value of the loadProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadProfile }
     *     
     */
    public void setLoadProfile(LoadProfile value) {
        this.loadProfile = value;
    }

}
