
package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "software", targetNamespace = "http://com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Software {


    /**
     * 
     * @param productId
     * @return
     *     returns java.lang.String
     * @throws ClassNotFoundException_Exception
     */
    @WebMethod(operationName = "GetSoftware")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetSoftware", targetNamespace = "http://com/", className = "com.GetSoftware")
    @ResponseWrapper(localName = "GetSoftwareResponse", targetNamespace = "http://com/", className = "com.GetSoftwareResponse")
    @Action(input = "http://com/software/GetSoftwareRequest", output = "http://com/software/GetSoftwareResponse", fault = {
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://com/software/GetSoftware/Fault/ClassNotFoundException")
    })
    public String getSoftware(
        @WebParam(name = "product_id", targetNamespace = "")
        String productId)
        throws ClassNotFoundException_Exception
    ;

}
