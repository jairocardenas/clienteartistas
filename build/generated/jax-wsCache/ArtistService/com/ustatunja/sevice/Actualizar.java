
package com.ustatunja.sevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="est" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizar", propOrder = {
    "id",
    "dName",
    "corr",
    "corP",
    "pass",
    "est"
})
public class Actualizar {

    protected Integer id;
    protected String dName;
    protected String corr;
    protected String corP;
    protected String pass;
    protected boolean est;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad dName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDName() {
        return dName;
    }

    /**
     * Define el valor de la propiedad dName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDName(String value) {
        this.dName = value;
    }

    /**
     * Obtiene el valor de la propiedad corr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorr() {
        return corr;
    }

    /**
     * Define el valor de la propiedad corr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorr(String value) {
        this.corr = value;
    }

    /**
     * Obtiene el valor de la propiedad corP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorP() {
        return corP;
    }

    /**
     * Define el valor de la propiedad corP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorP(String value) {
        this.corP = value;
    }

    /**
     * Obtiene el valor de la propiedad pass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPass() {
        return pass;
    }

    /**
     * Define el valor de la propiedad pass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPass(String value) {
        this.pass = value;
    }

    /**
     * Obtiene el valor de la propiedad est.
     * 
     */
    public boolean isEst() {
        return est;
    }

    /**
     * Define el valor de la propiedad est.
     * 
     */
    public void setEst(boolean value) {
        this.est = value;
    }

}
