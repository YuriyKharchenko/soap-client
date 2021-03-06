
package com.app.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebServiceClient(name = "ProcessorImplService", targetNamespace = "http://soap.app.com/", wsdlLocation = "http://127.0.0.1:8081/myWs?wsdl")
public class ProcessorImplService
        extends Service {

    private final static URL PROCESSORIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROCESSORIMPLSERVICE_EXCEPTION;
    private final static QName PROCESSORIMPLSERVICE_QNAME = new QName("http://soap.app.com/", "ProcessorImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8081/myWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PROCESSORIMPLSERVICE_WSDL_LOCATION = url;
        PROCESSORIMPLSERVICE_EXCEPTION = e;
    }

    public ProcessorImplService() {
        super(__getWsdlLocation(), PROCESSORIMPLSERVICE_QNAME);
    }

    public ProcessorImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROCESSORIMPLSERVICE_QNAME, features);
    }

    public ProcessorImplService(URL wsdlLocation) {
        super(wsdlLocation, PROCESSORIMPLSERVICE_QNAME);
    }

    public ProcessorImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROCESSORIMPLSERVICE_QNAME, features);
    }

    public ProcessorImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProcessorImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns ProcessorImpl
     */
    @WebEndpoint(name = "ProcessorImplPort")
    public ProcessorImpl getProcessorImplPort() {
        return super.getPort(new QName("http://soap.app.com/", "ProcessorImplPort"), ProcessorImpl.class);
    }

    /**
     * @param features A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns ProcessorImpl
     */
    @WebEndpoint(name = "ProcessorImplPort")
    public ProcessorImpl getProcessorImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.app.com/", "ProcessorImplPort"), ProcessorImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROCESSORIMPLSERVICE_EXCEPTION != null) {
            throw PROCESSORIMPLSERVICE_EXCEPTION;
        }
        return PROCESSORIMPLSERVICE_WSDL_LOCATION;
    }

}
