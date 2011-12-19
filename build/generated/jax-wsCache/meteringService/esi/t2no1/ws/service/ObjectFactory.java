
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

    private final static QName _SubmitQualitySeriesResponse_QNAME = new QName("http://service.ws.t2no1.esi/", "submitQualitySeriesResponse");
    private final static QName _SubmitQualitySeries_QNAME = new QName("http://service.ws.t2no1.esi/", "submitQualitySeries");
    private final static QName _SubmitLoadProfile_QNAME = new QName("http://service.ws.t2no1.esi/", "submitLoadProfile");
    private final static QName _SubmitLoadProfileResponse_QNAME = new QName("http://service.ws.t2no1.esi/", "submitLoadProfileResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esi.t2no1.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QualitySeriesInput }
     * 
     */
    public QualitySeriesInput createQualitySeriesInput() {
        return new QualitySeriesInput();
    }

    /**
     * Create an instance of {@link QualitySeriesInput.QualitySeries }
     * 
     */
    public QualitySeriesInput.QualitySeries createQualitySeriesInputQualitySeries() {
        return new QualitySeriesInput.QualitySeries();
    }

    /**
     * Create an instance of {@link SubmitLoadProfileResponse }
     * 
     */
    public SubmitLoadProfileResponse createSubmitLoadProfileResponse() {
        return new SubmitLoadProfileResponse();
    }

    /**
     * Create an instance of {@link SubmitLoadProfile }
     * 
     */
    public SubmitLoadProfile createSubmitLoadProfile() {
        return new SubmitLoadProfile();
    }

    /**
     * Create an instance of {@link SubmitQualitySeriesResponse }
     * 
     */
    public SubmitQualitySeriesResponse createSubmitQualitySeriesResponse() {
        return new SubmitQualitySeriesResponse();
    }

    /**
     * Create an instance of {@link SubmitQualitySeries }
     * 
     */
    public SubmitQualitySeries createSubmitQualitySeries() {
        return new SubmitQualitySeries();
    }

    /**
     * Create an instance of {@link LoadProfileInput }
     * 
     */
    public LoadProfileInput createLoadProfileInput() {
        return new LoadProfileInput();
    }

    /**
     * Create an instance of {@link LoadProfileOutput }
     * 
     */
    public LoadProfileOutput createLoadProfileOutput() {
        return new LoadProfileOutput();
    }

    /**
     * Create an instance of {@link MessageBase }
     * 
     */
    public MessageBase createMessageBase() {
        return new MessageBase();
    }

    /**
     * Create an instance of {@link LoadProfile }
     * 
     */
    public LoadProfile createLoadProfile() {
        return new LoadProfile();
    }

    /**
     * Create an instance of {@link QualitySeriesInput.QualitySeries.Entry }
     * 
     */
    public QualitySeriesInput.QualitySeries.Entry createQualitySeriesInputQualitySeriesEntry() {
        return new QualitySeriesInput.QualitySeries.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitQualitySeriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.t2no1.esi/", name = "submitQualitySeriesResponse")
    public JAXBElement<SubmitQualitySeriesResponse> createSubmitQualitySeriesResponse(SubmitQualitySeriesResponse value) {
        return new JAXBElement<SubmitQualitySeriesResponse>(_SubmitQualitySeriesResponse_QNAME, SubmitQualitySeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitQualitySeries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.t2no1.esi/", name = "submitQualitySeries")
    public JAXBElement<SubmitQualitySeries> createSubmitQualitySeries(SubmitQualitySeries value) {
        return new JAXBElement<SubmitQualitySeries>(_SubmitQualitySeries_QNAME, SubmitQualitySeries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitLoadProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.t2no1.esi/", name = "submitLoadProfile")
    public JAXBElement<SubmitLoadProfile> createSubmitLoadProfile(SubmitLoadProfile value) {
        return new JAXBElement<SubmitLoadProfile>(_SubmitLoadProfile_QNAME, SubmitLoadProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitLoadProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.t2no1.esi/", name = "submitLoadProfileResponse")
    public JAXBElement<SubmitLoadProfileResponse> createSubmitLoadProfileResponse(SubmitLoadProfileResponse value) {
        return new JAXBElement<SubmitLoadProfileResponse>(_SubmitLoadProfileResponse_QNAME, SubmitLoadProfileResponse.class, null, value);
    }

}
