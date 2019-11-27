
package com.ustatunja.sevice;

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
 * JAX-WS RI 2.3.2.payara-p2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductTypeService", targetNamespace = "http://sevice.ustatunja.com/", wsdlLocation = "http://localhost:8096/proyectoartistas/ProductTypeService?WSDL")
public class ProductTypeService_Service
    extends Service
{

    private final static URL PRODUCTTYPESERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTTYPESERVICE_EXCEPTION;
    private final static QName PRODUCTTYPESERVICE_QNAME = new QName("http://sevice.ustatunja.com/", "ProductTypeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8096/proyectoartistas/ProductTypeService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTTYPESERVICE_WSDL_LOCATION = url;
        PRODUCTTYPESERVICE_EXCEPTION = e;
    }

    public ProductTypeService_Service() {
        super(__getWsdlLocation(), PRODUCTTYPESERVICE_QNAME);
    }

    public ProductTypeService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTTYPESERVICE_QNAME, features);
    }

    public ProductTypeService_Service(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTTYPESERVICE_QNAME);
    }

    public ProductTypeService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTTYPESERVICE_QNAME, features);
    }

    public ProductTypeService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductTypeService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductTypeService
     */
    @WebEndpoint(name = "ProductTypeServicePort")
    public ProductTypeService getProductTypeServicePort() {
        return super.getPort(new QName("http://sevice.ustatunja.com/", "ProductTypeServicePort"), ProductTypeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductTypeService
     */
    @WebEndpoint(name = "ProductTypeServicePort")
    public ProductTypeService getProductTypeServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sevice.ustatunja.com/", "ProductTypeServicePort"), ProductTypeService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTTYPESERVICE_EXCEPTION!= null) {
            throw PRODUCTTYPESERVICE_EXCEPTION;
        }
        return PRODUCTTYPESERVICE_WSDL_LOCATION;
    }

}
