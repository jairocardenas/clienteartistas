/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustatunja.mb;

import com.ustatunja.sevice.ProductType;
import com.ustatunja.sevice.ProductTypeService_Service;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author camol
 */
@Named(value = "mbProductType")
@SessionScoped
public class MbProductType implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8096/proyectoartistas/ProductTypeService.wsdl")
    private ProductTypeService_Service service;
    private ProductType selected;
    private List<ProductType> productTypes;

    public MbProductType() {

    }

    public ProductType getSelected() {
        if (selected == null) {
            this.selected = new ProductType();
        }
        return this.selected;
    }

    public List<ProductType> getProductTypes() {
        return list();
    }

    public String addProductType() {
        add(getSelected().getName());
        return "listproducttype";
    }

    public String deleteProductType(ProductType objectito) {
        delete(objectito.getIdproducttype());
        return "adminproducttype";
    }

    public String redirectProductType(ProductType objProduct, String myFace) {
        this.selected = objProduct;
        return myFace;
    }

    public String updateProductType() {
        int id;
        String value;

        id = getSelected().getIdproducttype();
        value = getSelected().getName();

        update(id, value);
        this.selected = null;
        return "editadminproducttype";
    }

    private String delete(java.lang.Integer id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ustatunja.sevice.ProductTypeService port = service.getProductTypeServicePort();
        return port.delete(id);
    }

    private String add(java.lang.String name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ustatunja.sevice.ProductTypeService port = service.getProductTypeServicePort();
        return port.add(name);
    }

    private java.util.List<com.ustatunja.sevice.ProductType> list() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ustatunja.sevice.ProductTypeService port = service.getProductTypeServicePort();
        return port.list();
    }

    private String update(java.lang.Integer id, java.lang.String text) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ustatunja.sevice.ProductTypeService port = service.getProductTypeServicePort();
        return port.update(id, text);
    }

}
