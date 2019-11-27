/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustatunja.mb;

import com.ustatunja.sevice.Artist;
import com.ustatunja.sevice.ArtistService_Service;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author camol
 */
@Named(value = "mbArtist")
@SessionScoped
public class MbArtist implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8096/proyectoartistas/ArtistService.wsdl")
    private ArtistService_Service service;
    private Artist selected;
    private List<Artist> list;

    public MbArtist() {
    }

    public Artist getSelected() {
        if (this.selected == null) {
            this.selected = new Artist();
        }
        return this.selected;
    }

    public String addArtist() {

        String name, email, pEmail, cont;

        name = getSelected().getDisplayName();
        email = getSelected().getEmail();
        pEmail = getSelected().getPaypalEmail();
        cont = getSelected().getPassword();
        
        add(name, email, pEmail, cont);

        return "listartist";
    }

    public String deleteArtist(Artist obj) {
        delete(obj.getIdartist());
        return "adminartist";
    }

    public String updateArtist() {
        int id;
        String name, email, pEmail, cont;
        boolean estado;
        
        id = getSelected().getIdartist();
        name = getSelected().getDisplayName();
        email = getSelected().getEmail();
        pEmail = getSelected().getPaypalEmail();
        cont = getSelected().getPassword();
        estado = getSelected().isActive();
        
        this.selected = null;
        
        return "editadminartist";

    }
    
    public String redirectArt(Artist objArt, String myFace) {
        this.selected = objArt;
        return myFace;
    }

    public List<Artist> getList() {
        return listArtist();
    }

    private String add(java.lang.String dName, java.lang.String email, java.lang.String pEmail, java.lang.String cont) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ustatunja.sevice.ArtistService port = service.getArtistServicePort();
        return port.add(dName, email, pEmail, cont);
    }

    private String actualizar(java.lang.Integer id, java.lang.String dName, java.lang.String corr, java.lang.String corP, java.lang.String pass, boolean est) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ustatunja.sevice.ArtistService port = service.getArtistServicePort();
        return port.actualizar(id, dName, corr, corP, pass, est);
    }

    private String delete(java.lang.Integer id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ustatunja.sevice.ArtistService port = service.getArtistServicePort();
        return port.delete(id);
    }

    private java.util.List<com.ustatunja.sevice.Artist> listArtist() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ustatunja.sevice.ArtistService port = service.getArtistServicePort();
        return port.listArtist();
    }

}
