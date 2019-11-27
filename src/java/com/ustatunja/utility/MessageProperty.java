package com.ustatunja.utility;

import java.util.ResourceBundle;

import javax.faces.context.FacesContext;





public class MessageProperty {

	public static String getMessageProperty(String key) {
		FacesContext objFCont;
		ResourceBundle property;
		objFCont = FacesContext.getCurrentInstance();
		property = ResourceBundle.getBundle("com.ustatunja.label.message", objFCont.getViewRoot().getLocale());

		return property.getString(key);
	}

}
