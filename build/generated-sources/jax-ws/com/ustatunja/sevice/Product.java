
package com.ustatunja.sevice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para product complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="artOrderCollection" type="{http://sevice.ustatunja.com/}artOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idproduct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idproducttype" type="{http://sevice.ustatunja.com/}productType" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "artOrderCollection",
    "description",
    "idproduct",
    "idproducttype",
    "title"
})
public class Product {

    @XmlElement(nillable = true)
    protected List<ArtOrder> artOrderCollection;
    protected String description;
    protected Integer idproduct;
    protected ProductType idproducttype;
    protected String title;

    /**
     * Gets the value of the artOrderCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artOrderCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtOrderCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtOrder }
     * 
     * 
     */
    public List<ArtOrder> getArtOrderCollection() {
        if (artOrderCollection == null) {
            artOrderCollection = new ArrayList<ArtOrder>();
        }
        return this.artOrderCollection;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad idproduct.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdproduct() {
        return idproduct;
    }

    /**
     * Define el valor de la propiedad idproduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdproduct(Integer value) {
        this.idproduct = value;
    }

    /**
     * Obtiene el valor de la propiedad idproducttype.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getIdproducttype() {
        return idproducttype;
    }

    /**
     * Define el valor de la propiedad idproducttype.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setIdproducttype(ProductType value) {
        this.idproducttype = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
