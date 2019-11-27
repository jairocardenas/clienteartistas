
package com.ustatunja.sevice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ustatunja.sevice package. 
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

    private final static QName _Actualizar_QNAME = new QName("http://sevice.ustatunja.com/", "actualizar");
    private final static QName _ActualizarResponse_QNAME = new QName("http://sevice.ustatunja.com/", "actualizarResponse");
    private final static QName _Add_QNAME = new QName("http://sevice.ustatunja.com/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://sevice.ustatunja.com/", "addResponse");
    private final static QName _Delete_QNAME = new QName("http://sevice.ustatunja.com/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://sevice.ustatunja.com/", "deleteResponse");
    private final static QName _ListArtist_QNAME = new QName("http://sevice.ustatunja.com/", "listArtist");
    private final static QName _ListArtistResponse_QNAME = new QName("http://sevice.ustatunja.com/", "listArtistResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ustatunja.sevice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link ListArtist }
     * 
     */
    public ListArtist createListArtist() {
        return new ListArtist();
    }

    /**
     * Create an instance of {@link ListArtistResponse }
     * 
     */
    public ListArtistResponse createListArtistResponse() {
        return new ListArtistResponse();
    }

    /**
     * Create an instance of {@link Artist }
     * 
     */
    public Artist createArtist() {
        return new Artist();
    }

    /**
     * Create an instance of {@link ArtOrder }
     * 
     */
    public ArtOrder createArtOrder() {
        return new ArtOrder();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link Coupon }
     * 
     */
    public Coupon createCoupon() {
        return new Coupon();
    }

    /**
     * Create an instance of {@link CouponType }
     * 
     */
    public CouponType createCouponType() {
        return new CouponType();
    }

    /**
     * Create an instance of {@link PaymentStatus }
     * 
     */
    public PaymentStatus createPaymentStatus() {
        return new PaymentStatus();
    }

    /**
     * Create an instance of {@link TrackingTicket }
     * 
     */
    public TrackingTicket createTrackingTicket() {
        return new TrackingTicket();
    }

    /**
     * Create an instance of {@link TrackingStatus }
     * 
     */
    public TrackingStatus createTrackingStatus() {
        return new TrackingStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sevice.ustatunja.com/", name = "actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sevice.ustatunja.com/", name = "actualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://sevice.ustatunja.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sevice.ustatunja.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://sevice.ustatunja.com/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sevice.ustatunja.com/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListArtist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListArtist }{@code >}
     */
    @XmlElementDecl(namespace = "http://sevice.ustatunja.com/", name = "listArtist")
    public JAXBElement<ListArtist> createListArtist(ListArtist value) {
        return new JAXBElement<ListArtist>(_ListArtist_QNAME, ListArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListArtistResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListArtistResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sevice.ustatunja.com/", name = "listArtistResponse")
    public JAXBElement<ListArtistResponse> createListArtistResponse(ListArtistResponse value) {
        return new JAXBElement<ListArtistResponse>(_ListArtistResponse_QNAME, ListArtistResponse.class, null, value);
    }

}
