
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meteringMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meteringMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facilityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="meterValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NOId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meteringMessage", propOrder = {
    "areaId",
    "date",
    "facilityId",
    "meterValue",
    "noId"
})
public class MeteringMessage {

    protected int areaId;
    protected String date;
    protected int facilityId;
    protected int meterValue;
    @XmlElement(name = "NOId")
    protected String noId;

    /**
     * Gets the value of the areaId property.
     * 
     */
    public int getAreaId() {
        return areaId;
    }

    /**
     * Sets the value of the areaId property.
     * 
     */
    public void setAreaId(int value) {
        this.areaId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the facilityId property.
     * 
     */
    public int getFacilityId() {
        return facilityId;
    }

    /**
     * Sets the value of the facilityId property.
     * 
     */
    public void setFacilityId(int value) {
        this.facilityId = value;
    }

    /**
     * Gets the value of the meterValue property.
     * 
     */
    public int getMeterValue() {
        return meterValue;
    }

    /**
     * Sets the value of the meterValue property.
     * 
     */
    public void setMeterValue(int value) {
        this.meterValue = value;
    }

    /**
     * Gets the value of the noId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOId() {
        return noId;
    }

    /**
     * Sets the value of the noId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOId(String value) {
        this.noId = value;
    }

}
