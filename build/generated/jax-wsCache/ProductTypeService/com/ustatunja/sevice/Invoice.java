
package com.ustatunja.sevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para invoice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="invoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idartorder" type="{http://sevice.ustatunja.com/}artOrder" minOccurs="0"/&gt;
 *         &lt;element name="idcoupon" type="{http://sevice.ustatunja.com/}coupon" minOccurs="0"/&gt;
 *         &lt;element name="idinvoice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idpaymentstatus" type="{http://sevice.ustatunja.com/}paymentStatus" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice", propOrder = {
    "date",
    "idartorder",
    "idcoupon",
    "idinvoice",
    "idpaymentstatus",
    "price"
})
public class Invoice {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected ArtOrder idartorder;
    protected Coupon idcoupon;
    protected Integer idinvoice;
    protected PaymentStatus idpaymentstatus;
    protected Float price;

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
     * Obtiene el valor de la propiedad idcoupon.
     * 
     * @return
     *     possible object is
     *     {@link Coupon }
     *     
     */
    public Coupon getIdcoupon() {
        return idcoupon;
    }

    /**
     * Define el valor de la propiedad idcoupon.
     * 
     * @param value
     *     allowed object is
     *     {@link Coupon }
     *     
     */
    public void setIdcoupon(Coupon value) {
        this.idcoupon = value;
    }

    /**
     * Obtiene el valor de la propiedad idinvoice.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdinvoice() {
        return idinvoice;
    }

    /**
     * Define el valor de la propiedad idinvoice.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdinvoice(Integer value) {
        this.idinvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad idpaymentstatus.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatus }
     *     
     */
    public PaymentStatus getIdpaymentstatus() {
        return idpaymentstatus;
    }

    /**
     * Define el valor de la propiedad idpaymentstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatus }
     *     
     */
    public void setIdpaymentstatus(PaymentStatus value) {
        this.idpaymentstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrice(Float value) {
        this.price = value;
    }

}
