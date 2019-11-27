
package com.ustatunja.sevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para trackingTicket complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="trackingTicket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idartorder" type="{http://sevice.ustatunja.com/}artOrder" minOccurs="0"/&gt;
 *         &lt;element name="idtrackingstatus" type="{http://sevice.ustatunja.com/}trackingStatus" minOccurs="0"/&gt;
 *         &lt;element name="idtrackingticket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackingTicket", propOrder = {
    "date",
    "idartorder",
    "idtrackingstatus",
    "idtrackingticket"
})
public class TrackingTicket {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected ArtOrder idartorder;
    protected TrackingStatus idtrackingstatus;
    protected Integer idtrackingticket;

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad idartorder.
     * 
     * @return
     *     possible object is
     *     {@link ArtOrder }
     *     
     */
    public ArtOrder getIdartorder() {
        return idartorder;
    }

    /**
     * Define el valor de la propiedad idartorder.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtOrder }
     *     
     */
    public void setIdartorder(ArtOrder value) {
        this.idartorder = value;
    }

    /**
     * Obtiene el valor de la propiedad idtrackingstatus.
     * 
     * @return
     *     possible object is
     *     {@link TrackingStatus }
     *     
     */
    public TrackingStatus getIdtrackingstatus() {
        return idtrackingstatus;
    }

    /**
     * Define el valor de la propiedad idtrackingstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingStatus }
     *     
     */
    public void setIdtrackingstatus(TrackingStatus value) {
        this.idtrackingstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad idtrackingticket.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdtrackingticket() {
        return idtrackingticket;
    }

    /**
     * Define el valor de la propiedad idtrackingticket.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdtrackingticket(Integer value) {
        this.idtrackingticket = value;
    }

}
