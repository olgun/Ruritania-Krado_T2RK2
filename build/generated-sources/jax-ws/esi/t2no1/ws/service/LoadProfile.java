
package esi.t2no1.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for loadProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkLossConsumption" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="profileEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="profileSettledConsumption" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="profileStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="supplierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAreaInput" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadProfile", propOrder = {
    "calculationAreaId",
    "networkLossConsumption",
    "profileEndDate",
    "profileSettledConsumption",
    "profileStartDate",
    "supplierId",
    "totalAreaInput"
})
public class LoadProfile {

    protected String calculationAreaId;
    protected Long networkLossConsumption;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar profileEndDate;
    protected Long profileSettledConsumption;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar profileStartDate;
    protected String supplierId;
    protected Long totalAreaInput;

    /**
     * Gets the value of the calculationAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationAreaId() {
        return calculationAreaId;
    }

    /**
     * Sets the value of the calculationAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationAreaId(String value) {
        this.calculationAreaId = value;
    }

    /**
     * Gets the value of the networkLossConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetworkLossConsumption() {
        return networkLossConsumption;
    }

    /**
     * Sets the value of the networkLossConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetworkLossConsumption(Long value) {
        this.networkLossConsumption = value;
    }

    /**
     * Gets the value of the profileEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProfileEndDate() {
        return profileEndDate;
    }

    /**
     * Sets the value of the profileEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProfileEndDate(XMLGregorianCalendar value) {
        this.profileEndDate = value;
    }

    /**
     * Gets the value of the profileSettledConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfileSettledConsumption() {
        return profileSettledConsumption;
    }

    /**
     * Sets the value of the profileSettledConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfileSettledConsumption(Long value) {
        this.profileSettledConsumption = value;
    }

    /**
     * Gets the value of the profileStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProfileStartDate() {
        return profileStartDate;
    }

    /**
     * Sets the value of the profileStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProfileStartDate(XMLGregorianCalendar value) {
        this.profileStartDate = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierId(String value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the totalAreaInput property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalAreaInput() {
        return totalAreaInput;
    }

    /**
     * Sets the value of the totalAreaInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalAreaInput(Long value) {
        this.totalAreaInput = value;
    }

}
