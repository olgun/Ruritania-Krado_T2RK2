
package esi.t2no1.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitQualitySeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitQualitySeries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualitySeriesInput" type="{http://service.ws.t2no1.esi/}qualitySeriesInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitQualitySeries", propOrder = {
    "qualitySeriesInput"
})
public class SubmitQualitySeries {

    protected QualitySeriesInput qualitySeriesInput;

    /**
     * Gets the value of the qualitySeriesInput property.
     * 
     * @return
     *     possible object is
     *     {@link QualitySeriesInput }
     *     
     */
    public QualitySeriesInput getQualitySeriesInput() {
        return qualitySeriesInput;
    }

    /**
     * Sets the value of the qualitySeriesInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitySeriesInput }
     *     
     */
    public void setQualitySeriesInput(QualitySeriesInput value) {
        this.qualitySeriesInput = value;
    }

}
