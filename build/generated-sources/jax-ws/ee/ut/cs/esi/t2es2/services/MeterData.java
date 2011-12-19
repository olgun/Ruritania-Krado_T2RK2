
package ee.ut.cs.esi.t2es2.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for meterData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="messageSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="readingStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="readingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="client" type="{http://services.t2es2.esi.cs.ut.ee/}client" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterData", propOrder = {
    "messageId",
    "messageRecipient",
    "sendTime",
    "messageSender",
    "relatedMessageId",
    "readingValue",
    "estimated",
    "readingStartDate",
    "readingEndDate",
    "client"
})
public class MeterData {

    protected String messageId;
    protected String messageRecipient;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendTime;
    protected String messageSender;
    protected String relatedMessageId;
    protected String readingValue;
    protected boolean estimated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar readingStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar readingEndDate;
    protected Client client;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageRecipient() {
        return messageRecipient;
    }

    /**
     * Sets the value of the messageRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageRecipient(String value) {
        this.messageRecipient = value;
    }

    /**
     * Gets the value of the sendTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendTime() {
        return sendTime;
    }

    /**
     * Sets the value of the sendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendTime(XMLGregorianCalendar value) {
        this.sendTime = value;
    }

    /**
     * Gets the value of the messageSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSender() {
        return messageSender;
    }

    /**
     * Sets the value of the messageSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSender(String value) {
        this.messageSender = value;
    }

    /**
     * Gets the value of the relatedMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedMessageId() {
        return relatedMessageId;
    }

    /**
     * Sets the value of the relatedMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedMessageId(String value) {
        this.relatedMessageId = value;
    }

    /**
     * Gets the value of the readingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingValue() {
        return readingValue;
    }

    /**
     * Sets the value of the readingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingValue(String value) {
        this.readingValue = value;
    }

    /**
     * Gets the value of the estimated property.
     * 
     */
    public boolean isEstimated() {
        return estimated;
    }

    /**
     * Sets the value of the estimated property.
     * 
     */
    public void setEstimated(boolean value) {
        this.estimated = value;
    }

    /**
     * Gets the value of the readingStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReadingStartDate() {
        return readingStartDate;
    }

    /**
     * Sets the value of the readingStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReadingStartDate(XMLGregorianCalendar value) {
        this.readingStartDate = value;
    }

    /**
     * Gets the value of the readingEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReadingEndDate() {
        return readingEndDate;
    }

    /**
     * Sets the value of the readingEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReadingEndDate(XMLGregorianCalendar value) {
        this.readingEndDate = value;
    }

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

}
