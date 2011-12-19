
package t2no2api;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the t2no2api package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: t2no2api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoadProfile }
     * 
     */
    public LoadProfile createLoadProfile() {
        return new LoadProfile();
    }

    /**
     * Create an instance of {@link ES }
     * 
     */
    public ES createES() {
        return new ES();
    }

    /**
     * Create an instance of {@link QualitySeriesResponse }
     * 
     */
    public QualitySeriesResponse createQualitySeriesResponse() {
        return new QualitySeriesResponse();
    }

    /**
     * Create an instance of {@link TimePeriod }
     * 
     */
    public TimePeriod createTimePeriod() {
        return new TimePeriod();
    }

    /**
     * Create an instance of {@link SupplierChange }
     * 
     */
    public SupplierChange createSupplierChange() {
        return new SupplierChange();
    }

    /**
     * Create an instance of {@link QualitySeries }
     * 
     */
    public QualitySeries createQualitySeries() {
        return new QualitySeries();
    }

    /**
     * Create an instance of {@link SupplierChangeResponse }
     * 
     */
    public SupplierChangeResponse createSupplierChangeResponse() {
        return new SupplierChangeResponse();
    }

    /**
     * Create an instance of {@link LoadProfileResponse }
     * 
     */
    public LoadProfileResponse createLoadProfileResponse() {
        return new LoadProfileResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

}
