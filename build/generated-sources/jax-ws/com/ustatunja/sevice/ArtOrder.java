
package com.ustatunja.sevice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para artOrder complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="artOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="idartist" type="{http://sevice.ustatunja.com/}artist" minOccurs="0"/&gt;
 *         &lt;element name="idartorder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idclient" type="{http://sevice.ustatunja.com/}client" minOccurs="0"/&gt;
 *         &lt;element name="idproduct" type="{http://sevice.ustatunja.com/}product" minOccurs="0"/&gt;
 *         &lt;element name="invoiceCollection" type="{http://sevice.ustatunja.com/}invoice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trackingTicketCollection" type="{http://sevice.ustatunja.com/}trackingTicket" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "artOrder", propOrder = {
    "active",
    "idartist",
    "idartorder",
    "idclient",
    "idproduct",
    "invoiceCollection",
    "trackingTicketCollection"
})
public class ArtOrder {

    protected Boolean active;
    protected Artist idartist;
    protected Integer idartorder;
    protected Client idclient;
    protected Product idproduct;
    @XmlElement(nillable = true)
    protected List<Invoice> invoiceCollection;
    @XmlElement(nillable = true)
    protected List<TrackingTicket> trackingTicketCollection;

    /**
     * Obtiene el valor de la propiedad active.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Obtiene el valor de la propiedad idartist.
     * 
     * @return
     *     possible object is
     *     {@link Artist }
     *     
     */
    public Artist getIdartist() {
        return idartist;
    }

    /**
     * Define el valor de la propiedad idartist.
     * 
     * @param value
     *     allowed object is
     *     {@link Artist }
     *     
     */
    public void setIdartist(Artist value) {
        this.idartist = value;
    }

    /**
     * Obtiene el valor de la propiedad idartorder.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdartorder() {
        return idartorder;
    }

    /**
     * Define el valor de la propiedad idartorder.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdartorder(Integer value) {
        this.idartorder = value;
    }

    /**
     * Obtiene el valor de la propiedad idclient.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getIdclient() {
        return idclient;
    }

    /**
     * Define el valor de la propiedad idclient.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setIdclient(Client value) {
        this.idclient = value;
    }

    /**
     * Obtiene el valor de la propiedad idproduct.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getIdproduct() {
        return idproduct;
    }

    /**
     * Define el valor de la propiedad idproduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setIdproduct(Product value) {
        this.idproduct = value;
    }

    /**
     * Gets the value of the invoiceCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Invoice }
     * 
     * 
     */
    public List<Invoice> getInvoiceCollection() {
        if (invoiceCollection == null) {
            invoiceCollection = new ArrayList<Invoice>();
        }
        return this.invoiceCollection;
    }

    /**
     * Gets the value of the trackingTicketCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingTicketCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingTicketCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingTicket }
     * 
     * 
     */
    public List<TrackingTicket> getTrackingTicketCollection() {
        if (trackingTicketCollection == null) {
            trackingTicketCollection = new ArrayList<TrackingTicket>();
        }
        return this.trackingTicketCollection;
    }

}
