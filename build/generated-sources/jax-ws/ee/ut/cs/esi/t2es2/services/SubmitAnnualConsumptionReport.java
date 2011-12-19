
package ee.ut.cs.esi.t2es2.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitAnnualConsumptionReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitAnnualConsumptionReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annualConsumption" type="{http://services.t2es2.esi.cs.ut.ee/}annualConsumption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitAnnualConsumptionReport", propOrder = {
    "annualConsumption"
})
public class SubmitAnnualConsumptionReport {

    protected AnnualConsumption annualConsumption;

    /**
     * Gets the value of the annualConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualConsumption }
     *     
     */
    public AnnualConsumption getAnnualConsumption() {
        return annualConsumption;
    }

    /**
     * Sets the value of the annualConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualConsumption }
     *     
     */
    public void setAnnualConsumption(AnnualConsumption value) {
        this.annualConsumption = value;
    }

}
