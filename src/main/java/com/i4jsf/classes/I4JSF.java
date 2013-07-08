package com.i4jsf.classes;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import com.i4jsf.interfaces.IJsf;


public class I4JSF implements IJsf{
	
	
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
	
	
/**
 * @param componentId JSF
 * @param bundleVar internationalization variable 
 * @param keyProperties internationalization 
 */
	public void addTranslateContext(String componentId, String bundleVar,String keyProperties) {
		FacesContext context = FacesContext.getCurrentInstance();
		ResourceBundle bundle = context.getApplication().getResourceBundle(context, bundleVar);
		String message = bundle.getString(keyProperties);
		addFacesMessages(componentId, context, message);
	}


	/**
	 * 
	 * @param severity INFO, WARN, ERROR 
	 * @param msg message 
	 */
	public void  addMessageFaceContext(String idComponent,Severity severity, String msg) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = new FacesMessage(severity, msg ,"");
		facesContext.addMessage(idComponent, facesMessage);
	}

	/**
	 * 
	 * @param context
	 * @param message
	 */
	public void addFacesMessages(FacesContext context, String message) {
		FacesMessage faceMessages = new FacesMessage(message);
		context.addMessage(null, faceMessages);
	}
	/**
	 * add message to context for specific component
	 * @param componentId
	 * @param context
	 * @param message
	 */
	public void addFacesMessages(String componentId, FacesContext context,	String message) {
		FacesMessage facesMessage = new FacesMessage(message);
		context.addMessage(componentId, facesMessage);
	}

	/**
	 * 
	 * @param severity INFO, WARN, ERROR 
	 * @param msg
	 */
	public void addMessageFaceContext(Severity severity, String msg) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = new FacesMessage(severity, msg ,"");
		facesContext.addMessage(null, facesMessage);
		
	}
	
}
