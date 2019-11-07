
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
    private final static QName _GetHardware_QNAME = new QName("http://com/", "GetHardware");
    private final static QName _GetHardwareResponse_QNAME = new QName("http://com/", "GetHardwareResponse");

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
     * Create an instance of {@link GetHardware }
     * 
     */
    public GetHardware createGetHardware() {
        return new GetHardware();
    }

    /**
     * Create an instance of {@link GetHardwareResponse }
     * 
     */
    public GetHardwareResponse createGetHardwareResponse() {
        return new GetHardwareResponse();
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
    @XmlElementDecl(namespace = "http://com/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHardware }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHardware }{@code >}
     */
    @XmlElementDecl(namespace = "http://com/", name = "GetHardware")
    public JAXBElement<GetHardware> createGetHardware(GetHardware value) {
        return new JAXBElement<GetHardware>(_GetHardware_QNAME, GetHardware.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHardwareResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHardwareResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://com/", name = "GetHardwareResponse")
    public JAXBElement<GetHardwareResponse> createGetHardwareResponse(GetHardwareResponse value) {
        return new JAXBElement<GetHardwareResponse>(_GetHardwareResponse_QNAME, GetHardwareResponse.class, null, value);
    }

}
