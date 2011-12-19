
package ee.ut.cs.esi.t2es2.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitAPERAK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitAPERAK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aperak" type="{http://services.t2es2.esi.cs.ut.ee/}aperak" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitAPERAK", propOrder = {
    "aperak"
})
public class SubmitAPERAK {

    protected Aperak aperak;

    /**
     * Gets the value of the aperak property.
     * 
     * @return
     *     possible object is
     *     {@link Aperak }
     *     
     */
    public Aperak getAperak() {
        return aperak;
    }

    /**
     * Sets the value of the aperak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aperak }
     *     
     */
    public void setAperak(Aperak value) {
        this.aperak = value;
    }

}
