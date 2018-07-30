
package top.gonefuture.java.api.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the top.gonefuture.java.api.webservice package.
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

    private final static QName _GetBornDesc_QNAME = new QName("http://webService.api.java.gonefuture.top/", "getBornDesc");
    private final static QName _SayHelloResponse_QNAME = new QName("http://webService.api.java.gonefuture.top/", "sayHelloResponse");
    private final static QName _GetBornDescResponse_QNAME = new QName("http://webService.api.java.gonefuture.top/", "getBornDescResponse");
    private final static QName _SayHello_QNAME = new QName("http://webService.api.java.gonefuture.top/", "sayHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: top.gonefuture.java.api.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBornDescResponse }
     * 
     */
    public GetBornDescResponse createGetBornDescResponse() {
        return new GetBornDescResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetBornDesc }
     * 
     */
    public GetBornDesc createGetBornDesc() {
        return new GetBornDesc();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBornDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.api.java.gonefuture.top/", name = "getBornDesc")
    public JAXBElement<GetBornDesc> createGetBornDesc(GetBornDesc value) {
        return new JAXBElement<GetBornDesc>(_GetBornDesc_QNAME, GetBornDesc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.api.java.gonefuture.top/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBornDescResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.api.java.gonefuture.top/", name = "getBornDescResponse")
    public JAXBElement<GetBornDescResponse> createGetBornDescResponse(GetBornDescResponse value) {
        return new JAXBElement<GetBornDescResponse>(_GetBornDescResponse_QNAME, GetBornDescResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.api.java.gonefuture.top/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

}
