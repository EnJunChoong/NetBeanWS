
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
    private final static QName _GetSoftware_QNAME = new QName("http://com/", "GetSoftware");
    private final static QName _GetSoftwareResponse_QNAME = new QName("http://com/", "GetSoftwareResponse");

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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoftware }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "GetSoftware")
    public JAXBElement<GetSoftware> createGetSoftware(GetSoftware value) {
        return new JAXBElement<GetSoftware>(_GetSoftware_QNAME, GetSoftware.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoftwareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "GetSoftwareResponse")
    public JAXBElement<GetSoftwareResponse> createGetSoftwareResponse(GetSoftwareResponse value) {
        return new JAXBElement<GetSoftwareResponse>(_GetSoftwareResponse_QNAME, GetSoftwareResponse.class, null, value);
    }

}
