
package mypackage;

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
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "mijnService", targetNamespace = "http://schemas.hu.fnt.nl/berichten/message", wsdlLocation = "file:/C:/Users/RoyH-/Git/IAC-BMIServiceSOAP/src/BMIService.wsdl")
public class MijnService
    extends Service
{

    private final static URL MIJNSERVICE_WSDL_LOCATION;
    private final static WebServiceException MIJNSERVICE_EXCEPTION;
    private final static QName MIJNSERVICE_QNAME = new QName("http://schemas.hu.fnt.nl/berichten/message", "mijnService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/RoyH-/Git/IAC-BMIServiceSOAP/src/BMIService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MIJNSERVICE_WSDL_LOCATION = url;
        MIJNSERVICE_EXCEPTION = e;
    }

    public MijnService() {
        super(__getWsdlLocation(), MIJNSERVICE_QNAME);
    }

    public MijnService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MIJNSERVICE_QNAME, features);
    }

    public MijnService(URL wsdlLocation) {
        super(wsdlLocation, MIJNSERVICE_QNAME);
    }

    public MijnService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MIJNSERVICE_QNAME, features);
    }

    public MijnService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MijnService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WS-Port")
    public WSInterface getWSPort() {
        return super.getPort(new QName("http://schemas.hu.fnt.nl/berichten/message", "WS-Port"), WSInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WS-Port")
    public WSInterface getWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.hu.fnt.nl/berichten/message", "WS-Port"), WSInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MIJNSERVICE_EXCEPTION!= null) {
            throw MIJNSERVICE_EXCEPTION;
        }
        return MIJNSERVICE_WSDL_LOCATION;
    }

}
