
package software_table;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the software_table package. 
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

    private final static QName _ClassNotFoundException_QNAME = new QName("http://software_table/", "ClassNotFoundException");
    private final static QName _GetSoftware_QNAME = new QName("http://software_table/", "GetSoftware");
    private final static QName _GetSoftwareResponse_QNAME = new QName("http://software_table/", "GetSoftwareResponse");
    private final static QName _Availability_QNAME = new QName("http://software_table/", "availability");
    private final static QName _AvailabilityResponse_QNAME = new QName("http://software_table/", "availabilityResponse");
    private final static QName _Cost_QNAME = new QName("http://software_table/", "cost");
    private final static QName _CostResponse_QNAME = new QName("http://software_table/", "costResponse");
    private final static QName _ProductDescription_QNAME = new QName("http://software_table/", "product_description");
    private final static QName _ProductDescriptionResponse_QNAME = new QName("http://software_table/", "product_descriptionResponse");
    private final static QName _Quantity_QNAME = new QName("http://software_table/", "quantity");
    private final static QName _QuantityResponse_QNAME = new QName("http://software_table/", "quantityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: software_table
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link GetSoftware }
     * 
     */
    public GetSoftware createGetSoftware() {
        return new GetSoftware();
    }

    /**
     * Create an instance of {@link GetSoftwareResponse }
     * 
     */
    public GetSoftwareResponse createGetSoftwareResponse() {
        return new GetSoftwareResponse();
    }

    /**
     * Create an instance of {@link Availability }
     * 
     */
    public Availability createAvailability() {
        return new Availability();
    }

    /**
     * Create an instance of {@link AvailabilityResponse }
     * 
     */
    public AvailabilityResponse createAvailabilityResponse() {
        return new AvailabilityResponse();
    }

    /**
     * Create an instance of {@link Cost }
     * 
     */
    public Cost createCost() {
        return new Cost();
    }

    /**
     * Create an instance of {@link CostResponse }
     * 
     */
    public CostResponse createCostResponse() {
        return new CostResponse();
    }

    /**
     * Create an instance of {@link ProductDescription }
     * 
     */
    public ProductDescription createProductDescription() {
        return new ProductDescription();
    }

    /**
     * Create an instance of {@link ProductDescriptionResponse }
     * 
     */
    public ProductDescriptionResponse createProductDescriptionResponse() {
        return new ProductDescriptionResponse();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link QuantityResponse }
     * 
     */
    public QuantityResponse createQuantityResponse() {
        return new QuantityResponse();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoftware }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSoftware }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "GetSoftware")
    public JAXBElement<GetSoftware> createGetSoftware(GetSoftware value) {
        return new JAXBElement<GetSoftware>(_GetSoftware_QNAME, GetSoftware.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoftwareResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSoftwareResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "GetSoftwareResponse")
    public JAXBElement<GetSoftwareResponse> createGetSoftwareResponse(GetSoftwareResponse value) {
        return new JAXBElement<GetSoftwareResponse>(_GetSoftwareResponse_QNAME, GetSoftwareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Availability }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Availability }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "availability")
    public JAXBElement<Availability> createAvailability(Availability value) {
        return new JAXBElement<Availability>(_Availability_QNAME, Availability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailabilityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AvailabilityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "availabilityResponse")
    public JAXBElement<AvailabilityResponse> createAvailabilityResponse(AvailabilityResponse value) {
        return new JAXBElement<AvailabilityResponse>(_AvailabilityResponse_QNAME, AvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cost }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cost }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "cost")
    public JAXBElement<Cost> createCost(Cost value) {
        return new JAXBElement<Cost>(_Cost_QNAME, Cost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CostResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "costResponse")
    public JAXBElement<CostResponse> createCostResponse(CostResponse value) {
        return new JAXBElement<CostResponse>(_CostResponse_QNAME, CostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "product_description")
    public JAXBElement<ProductDescription> createProductDescription(ProductDescription value) {
        return new JAXBElement<ProductDescription>(_ProductDescription_QNAME, ProductDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDescriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductDescriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "product_descriptionResponse")
    public JAXBElement<ProductDescriptionResponse> createProductDescriptionResponse(ProductDescriptionResponse value) {
        return new JAXBElement<ProductDescriptionResponse>(_ProductDescriptionResponse_QNAME, ProductDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Quantity }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "quantity")
    public JAXBElement<Quantity> createQuantity(Quantity value) {
        return new JAXBElement<Quantity>(_Quantity_QNAME, Quantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuantityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://software_table/", name = "quantityResponse")
    public JAXBElement<QuantityResponse> createQuantityResponse(QuantityResponse value) {
        return new JAXBElement<QuantityResponse>(_QuantityResponse_QNAME, QuantityResponse.class, null, value);
    }

}
