
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

    private final static QName _ClassNotFoundException_QNAME = new QName("http://com/", "ClassNotFoundException");
    private final static QName _GetFirmWare_QNAME = new QName("http://com/", "GetFirmWare");
    private final static QName _GetFirmWareResponse_QNAME = new QName("http://com/", "GetFirmWareResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
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
     * Create an instance of {@link GetFirmWare }
     * 
     */
    public GetFirmWare createGetFirmWare() {
        return new GetFirmWare();
    }

    /**
     * Create an instance of {@link GetFirmWareResponse }
     * 
     */
    public GetFirmWareResponse createGetFirmWareResponse() {
        return new GetFirmWareResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFirmWare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "GetFirmWare")
    public JAXBElement<GetFirmWare> createGetFirmWare(GetFirmWare value) {
        return new JAXBElement<GetFirmWare>(_GetFirmWare_QNAME, GetFirmWare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFirmWareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "GetFirmWareResponse")
    public JAXBElement<GetFirmWareResponse> createGetFirmWareResponse(GetFirmWareResponse value) {
        return new JAXBElement<GetFirmWareResponse>(_GetFirmWareResponse_QNAME, GetFirmWareResponse.class, null, value);
    }

}
