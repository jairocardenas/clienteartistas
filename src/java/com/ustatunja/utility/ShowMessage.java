package com.ustatunja.utility;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ShowMessage {

	public static void error(String resumen, String detalle) {
		FacesMessage objFMsg;
		FacesContext objFCont;

		objFMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, resumen, detalle);
		objFCont = FacesContext.getCurrentInstance();
		objFCont.addMessage(null, objFMsg);

	}

	public static void exito(String resumen, String detalle) {
		FacesMessage objFMsg;
		FacesContext objFCont;

		objFMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, resumen, detalle);
		objFCont = FacesContext.getCurrentInstance();
		objFCont.addMessage("succesInfo", objFMsg);

	}

}
