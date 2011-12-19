
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supplierChangeReplyMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supplierChangeReplyMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="areaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="facilityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "supplierChangeReplyMessage", propOrder = {
    "accepted",
    "areaId",
    "facilityId",
    "noId"
})
public class SupplierChangeReplyMessage {

    protected boolean accepted;
    protected int areaId;
    protected int facilityId;
    @XmlElement(name = "NOId")
    protected String noId;

    /**
     * Gets the value of the accepted property.
     * 
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     */
    public void setAccepted(boolean value) {
        this.accepted = value;
    }

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
