package com.i4jsf.classes;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import com.i4jsf.interfaces.IJsf;


public class IJsfImpl implements IJsf{
	
	
	/**
	 * @param bundleVar
	 * @param keyProperties
	 */
	public void addTranslateContext(String bundleVar, String keyProperties){
		FacesContext context = FacesContext.getCurrentInstance();
		ResourceBundle bundle = context.getApplication().getResourceBundle(context, bundleVar);
			String message = bundle.getString(keyProperties);
			addFacesMessages(context, message);
	}
	
	private void addFacesMessages(FacesContext context, String message) {
		FacesMessage faceMessages = new FacesMessage(message);
		context.addMessage(null, faceMessages);
	}
	
	
/**
 * @param componentId JSF
 * @param bundleVar internationalization variable 
 * @param keyProperties internationalization 
 */
	public void addTranslateContext(String componentId, String bundleVar,String keyProperties) {
		FacesContext context = FacesContext.getCurrentInstance();
		ResourceBundle bundle = context.getApplication().getResourceBundle(context, bundleVar);
		String message = bundle.getString(keyProperties);
		FacesMessage facesMessage = new FacesMessage(message);
		context.addMessage(componentId, facesMessage);
	}
	
	/**
	 * 
	 * @param severity INFO, WARN, ERROR 
	 * @param msg message 
	 */
	public void  addMessageFaceContext(Severity severity, String msg) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = new FacesMessage(severity, msg ,"");
		facesContext.addMessage(null, facesMessage);
	}

	/**
	 * 
	 * @param message
	 */
	public void addMessageFaceContext(String message){
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = new FacesMessage(message);
		context.addMessage(null, facesMessage);
	}
	
}
