
package ee.ut.cs.esi.t2es2.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitMeterData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitMeterData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meterData" type="{http://services.t2es2.esi.cs.ut.ee/}meterData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitMeterData", propOrder = {
    "meterData"
})
public class SubmitMeterData {

    protected MeterData meterData;

    /**
     * Gets the value of the meterData property.
     * 
     * @return
     *     possible object is
     *     {@link MeterData }
     *     
     */
    public MeterData getMeterData() {
        return meterData;
    }

    /**
     * Sets the value of the meterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterData }
     *     
     */
    public void setMeterData(MeterData value) {
        this.meterData = value;
    }

}
