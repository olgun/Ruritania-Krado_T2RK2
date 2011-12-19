
package com.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientRegistrationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientRegistrationMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="facilityAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facilityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NOId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousSupplierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectedUsage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="settlementMethod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientRegistrationMessage", propOrder = {
    "areaId",
    "clientID",
    "facilityAddress",
    "facilityId",
    "noId",
    "name",
    "postalAddress",
    "previousSupplierId",
    "projectedUsage",
    "settlementMethod",
    "startDate"
})
public class ClientRegistrationMessage {

    protected int areaId;
    protected int clientID;
    protected String facilityAddress;
    protected int facilityId;
    @XmlElement(name = "NOId")
    protected String noId;
    protected String name;
    protected String postalAddress;
    protected String previousSupplierId;
    protected int projectedUsage;
    protected int settlementMethod;
    protected String startDate;

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
     * Gets the value of the clientID property.
     * 
     */
    public int getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     */
    public void setClientID(int value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the facilityAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityAddress() {
        return facilityAddress;
    }

    /**
     * Sets the value of the facilityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityAddress(String value) {
        this.facilityAddress = value;
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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress(String value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the previousSupplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSupplierId() {
        return previousSupplierId;
    }

    /**
     * Sets the value of the previousSupplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSupplierId(String value) {
        this.previousSupplierId = value;
    }

    /**
     * Gets the value of the projectedUsage property.
     * 
     */
    public int getProjectedUsage() {
        return projectedUsage;
    }

    /**
     * Sets the value of the projectedUsage property.
     * 
     */
    public void setProjectedUsage(int value) {
        this.projectedUsage = value;
    }

    /**
     * Gets the value of the settlementMethod property.
     * 
     */
    public int getSettlementMethod() {
        return settlementMethod;
    }

    /**
     * Sets the value of the settlementMethod property.
     * 
     */
    public void setSettlementMethod(int value) {
        this.settlementMethod = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

}
