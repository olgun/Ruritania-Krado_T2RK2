
package esi.t2no1.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createContractInput" type="{http://service.ws.t2no1.esi/}createContractInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createContract", propOrder = {
    "createContractInput"
})
public class CreateContract {

    protected CreateContractInput createContractInput;

    /**
     * Gets the value of the createContractInput property.
     * 
     * @return
     *     possible object is
     *     {@link CreateContractInput }
     *     
     */
    public CreateContractInput getCreateContractInput() {
        return createContractInput;
    }

    /**
     * Sets the value of the createContractInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContractInput }
     *     
     */
    public void setCreateContractInput(CreateContractInput value) {
        this.createContractInput = value;
    }

}
