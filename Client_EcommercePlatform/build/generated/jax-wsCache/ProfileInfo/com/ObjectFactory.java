
package com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
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

    private final static QName _Address1_QNAME = new QName("http://ProfileInfo/", "Address1");
    private final static QName _Address1Response_QNAME = new QName("http://ProfileInfo/", "Address1Response");
    private final static QName _Address2_QNAME = new QName("http://ProfileInfo/", "Address2");
    private final static QName _Address2Response_QNAME = new QName("http://ProfileInfo/", "Address2Response");
    private final static QName _City_QNAME = new QName("http://ProfileInfo/", "City");
    private final static QName _CityResponse_QNAME = new QName("http://ProfileInfo/", "CityResponse");
    private final static QName _ClassNotFoundException_QNAME = new QName("http://ProfileInfo/", "ClassNotFoundException");
    private final static QName _CustomerName_QNAME = new QName("http://ProfileInfo/", "CustomerName");
    private final static QName _CustomerNameResponse_QNAME = new QName("http://ProfileInfo/", "CustomerNameResponse");
    private final static QName _GetProfile_QNAME = new QName("http://ProfileInfo/", "GetProfile");
    private final static QName _GetProfileResponse_QNAME = new QName("http://ProfileInfo/", "GetProfileResponse");
    private final static QName _Phone_QNAME = new QName("http://ProfileInfo/", "Phone");
    private final static QName _PhoneResponse_QNAME = new QName("http://ProfileInfo/", "PhoneResponse");
    private final static QName _State_QNAME = new QName("http://ProfileInfo/", "State");
    private final static QName _StateResponse_QNAME = new QName("http://ProfileInfo/", "StateResponse");
    private final static QName _Zip_QNAME = new QName("http://ProfileInfo/", "Zip");
    private final static QName _ZipResponse_QNAME = new QName("http://ProfileInfo/", "ZipResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Address1 }
     * 
     */
    public Address1 createAddress1() {
        return new Address1();
    }

    /**
     * Create an instance of {@link Address1Response }
     * 
     */
    public Address1Response createAddress1Response() {
        return new Address1Response();
    }

    /**
     * Create an instance of {@link Address2 }
     * 
     */
    public Address2 createAddress2() {
        return new Address2();
    }

    /**
     * Create an instance of {@link Address2Response }
     * 
     */
    public Address2Response createAddress2Response() {
        return new Address2Response();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link CityResponse }
     * 
     */
    public CityResponse createCityResponse() {
        return new CityResponse();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link CustomerName }
     * 
     */
    public CustomerName createCustomerName() {
        return new CustomerName();
    }

    /**
     * Create an instance of {@link CustomerNameResponse }
     * 
     */
    public CustomerNameResponse createCustomerNameResponse() {
        return new CustomerNameResponse();
    }

    /**
     * Create an instance of {@link GetProfile }
     * 
     */
    public GetProfile createGetProfile() {
        return new GetProfile();
    }

    /**
     * Create an instance of {@link GetProfileResponse }
     * 
     */
    public GetProfileResponse createGetProfileResponse() {
        return new GetProfileResponse();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link PhoneResponse }
     * 
     */
    public PhoneResponse createPhoneResponse() {
        return new PhoneResponse();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link StateResponse }
     * 
     */
    public StateResponse createStateResponse() {
        return new StateResponse();
    }

    /**
     * Create an instance of {@link Zip }
     * 
     */
    public Zip createZip() {
        return new Zip();
    }

    /**
     * Create an instance of {@link ZipResponse }
     * 
     */
    public ZipResponse createZipResponse() {
        return new ZipResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Address1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "Address1")
    public JAXBElement<Address1> createAddress1(Address1 value) {
        return new JAXBElement<Address1>(_Address1_QNAME, Address1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "Address1Response")
    public JAXBElement<Address1Response> createAddress1Response(Address1Response value) {
        return new JAXBElement<Address1Response>(_Address1Response_QNAME, Address1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "Address2")
    public JAXBElement<Address2> createAddress2(Address2 value) {
        return new JAXBElement<Address2>(_Address2_QNAME, Address2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "Address2Response")
    public JAXBElement<Address2Response> createAddress2Response(Address2Response value) {
        return new JAXBElement<Address2Response>(_Address2Response_QNAME, Address2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link City }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "City")
    public JAXBElement<City> createCity(City value) {
        return new JAXBElement<City>(_City_QNAME, City.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "CityResponse")
    public JAXBElement<CityResponse> createCityResponse(CityResponse value) {
        return new JAXBElement<CityResponse>(_CityResponse_QNAME, CityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "CustomerName")
    public JAXBElement<CustomerName> createCustomerName(CustomerName value) {
        return new JAXBElement<CustomerName>(_CustomerName_QNAME, CustomerName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "CustomerNameResponse")
    public JAXBElement<CustomerNameResponse> createCustomerNameResponse(CustomerNameResponse value) {
        return new JAXBElement<CustomerNameResponse>(_CustomerNameResponse_QNAME, CustomerNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "GetProfile")
    public JAXBElement<GetProfile> createGetProfile(GetProfile value) {
        return new JAXBElement<GetProfile>(_GetProfile_QNAME, GetProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "GetProfileResponse")
    public JAXBElement<GetProfileResponse> createGetProfileResponse(GetProfileResponse value) {
        return new JAXBElement<GetProfileResponse>(_GetProfileResponse_QNAME, GetProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Phone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "Phone")
    public JAXBElement<Phone> createPhone(Phone value) {
        return new JAXBElement<Phone>(_Phone_QNAME, Phone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "PhoneResponse")
    public JAXBElement<PhoneResponse> createPhoneResponse(PhoneResponse value) {
        return new JAXBElement<PhoneResponse>(_PhoneResponse_QNAME, PhoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "State")
    public JAXBElement<State> createState(State value) {
        return new JAXBElement<State>(_State_QNAME, State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "StateResponse")
    public JAXBElement<StateResponse> createStateResponse(StateResponse value) {
        return new JAXBElement<StateResponse>(_StateResponse_QNAME, StateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "Zip")
    public JAXBElement<Zip> createZip(Zip value) {
        return new JAXBElement<Zip>(_Zip_QNAME, Zip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ProfileInfo/", name = "ZipResponse")
    public JAXBElement<ZipResponse> createZipResponse(ZipResponse value) {
        return new JAXBElement<ZipResponse>(_ZipResponse_QNAME, ZipResponse.class, null, value);
    }

}
