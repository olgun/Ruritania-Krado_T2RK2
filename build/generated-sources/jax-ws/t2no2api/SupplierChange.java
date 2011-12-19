
package t2no2api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SupplierChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{urn:T2NO2Api}Client"/>
 *         &lt;element name="oldES" type="{urn:T2NO2Api}ES" minOccurs="0"/>
 *         &lt;element name="newES" type="{urn:T2NO2Api}ES"/>
 *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierChange", propOrder = {
    "client",
    "oldES",
    "newES",
    "changeDate"
})
public class SupplierChange {

    @XmlElement(required = true)
    protected Client client;
    protected ES oldES;
    @XmlElement(required = true)
    protected ES newES;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Gets the value of the oldES property.
     * 
     * @return
     *     possible object is
     *     {@link ES }
     *     
     */
    public ES getOldES() {
        return oldES;
    }

    /**
     * Sets the value of the oldES property.
     * 
     * @param value
     *     allowed object is
     *     {@link ES }
     *     
     */
    public void setOldES(ES value) {
        this.oldES = value;
    }

    /**
     * Gets the value of the newES property.
     * 
     * @return
     *     possible object is
     *     {@link ES }
     *     
     */
    public ES getNewES() {
        return newES;
    }

    /**
     * Sets the value of the newES property.
     * 
     * @param value
     *     allowed object is
     *     {@link ES }
     *     
     */
    public void setNewES(ES value) {
        this.newES = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

}
