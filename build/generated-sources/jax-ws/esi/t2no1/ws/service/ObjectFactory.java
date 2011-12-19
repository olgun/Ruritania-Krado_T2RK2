
package esi.t2no1.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esi.t2no1.ws.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateContractResponse_QNAME = new QName("http://service.ws.t2no1.esi/", "createContractResponse");
    private final static QName _GetContractResponse_QNAME = new QName("http://service.ws.t2no1.esi/", "getContractResponse");
    private final static QName _CreateContract_QNAME = new QName("http://service.ws.t2no1.esi/", "createContract");
    private final static QName _GetContract_QNAME = new QName("http://service.ws.t2no1.esi/", "getContract");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esi.t2no1.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetContract }
     * 
     */
    public GetContract createGetContract() {
        return new GetContract();
    }

    /**
     * Create an instance of {@link GetContractResponse }
     * 
     */
    public GetContractResponse createGetContractResponse() {
        return new GetContractResponse();
    }

    /**
     * Create an instance of {@link CreateContract }
     * 
     */
    public CreateContract createCreateContract() {
        return new CreateContract();
    }

    /**
     * Create an instance of {@link CreateContractResponse }
     * 
     */
    public CreateContractResponse createCreateContractResponse() {
        return new CreateContractResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link CreateContractOutput }
     * 
     */
    public CreateContractOutput createCreateContractOutput() {
        return new CreateContractOutput();
    }

    /**
     * Create an instance of {@link MessageBase }
     * 
     */
    public MessageBase createMessageBase() {
        return new MessageBase();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link CreateContractInput }
     * 
     */
    public CreateContractInput createCreateContractInput() {
        return new CreateContractInput();
    }

    /**
     * Create an instance of {@link ContractOutput }
     * 
     */
    public ContractOutput createContractOutput() {
        return new ContractOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.t2no1.esi/", name = "createContractResponse")
    public JAXBElement<CreateContractResponse> createCreateContractResponse(CreateContractResponse value) {
        return new JAXBElement<CreateContractResponse>(_CreateContractResponse_QNAME, CreateContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.t2no1.esi/", name = "getContractResponse")
    public JAXBElement<GetContractResponse> createGetContractResponse(GetContractResponse value) {
        return new JAXBElement<GetContractResponse>(_GetContractResponse_QNAME, GetContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.t2no1.esi/", name = "createContract")
    public JAXBElement<CreateContract> createCreateContract(CreateContract value) {
        return new JAXBElement<CreateContract>(_CreateContract_QNAME, CreateContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.t2no1.esi/", name = "getContract")
    public JAXBElement<GetContract> createGetContract(GetContract value) {
        return new JAXBElement<GetContract>(_GetContract_QNAME, GetContract.class, null, value);
    }

}
