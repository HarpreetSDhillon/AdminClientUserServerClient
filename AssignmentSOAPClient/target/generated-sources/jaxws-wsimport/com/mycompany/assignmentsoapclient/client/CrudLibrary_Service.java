
package com.mycompany.assignmentsoapclient.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CrudLibrary", targetNamespace = "http://Services/", wsdlLocation = "http://localhost:8080/AssignmentSOAPService/CrudLibrary?wsdl")
public class CrudLibrary_Service
    extends Service
{

    private final static URL CRUDLIBRARY_WSDL_LOCATION;
    private final static WebServiceException CRUDLIBRARY_EXCEPTION;
    private final static QName CRUDLIBRARY_QNAME = new QName("http://Services/", "CrudLibrary");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AssignmentSOAPService/CrudLibrary?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CRUDLIBRARY_WSDL_LOCATION = url;
        CRUDLIBRARY_EXCEPTION = e;
    }

    public CrudLibrary_Service() {
        super(__getWsdlLocation(), CRUDLIBRARY_QNAME);
    }

    public CrudLibrary_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CRUDLIBRARY_QNAME, features);
    }

    public CrudLibrary_Service(URL wsdlLocation) {
        super(wsdlLocation, CRUDLIBRARY_QNAME);
    }

    public CrudLibrary_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CRUDLIBRARY_QNAME, features);
    }

    public CrudLibrary_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CrudLibrary_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CrudLibrary
     */
    @WebEndpoint(name = "CrudLibraryPort")
    public CrudLibrary getCrudLibraryPort() {
        return super.getPort(new QName("http://Services/", "CrudLibraryPort"), CrudLibrary.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CrudLibrary
     */
    @WebEndpoint(name = "CrudLibraryPort")
    public CrudLibrary getCrudLibraryPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Services/", "CrudLibraryPort"), CrudLibrary.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CRUDLIBRARY_EXCEPTION!= null) {
            throw CRUDLIBRARY_EXCEPTION;
        }
        return CRUDLIBRARY_WSDL_LOCATION;
    }

}
