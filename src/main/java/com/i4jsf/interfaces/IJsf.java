package com.i4jsf.interfaces;

import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public interface IJsf {
	/**
	 *add message non specific component id. Message coming from bundle properties
	 * @param bundleVar
	 * @param keyProperties
	 */
	public void addTranslateContext(String bundleVar, String keyProperties);
	/**
	 * add specific message coming from bundle to specific component id
	 * @param componentId
	 * @param bundleVar internationalization variable 
	 * @param keyProperties internationalization 
	 */
		
	public void addTranslateContext(String componentId, String bundleVar,
			String keyProperties);
	/**
	 * add message to specific component via id, informing severity and message
	 * @param severity INFO, WARN, ERROR 
	 * @param msg message 
	 */
	public void addMessageFaceContext(String componentId, Severity severity,
			String message);
	/**
	 * add message to context
	 * @param context
	 * @param message
	 */
	public void addFacesMessages(FacesContext context, String message);
	/**
	 * add message to context for specific component by id 
	 * @param componentId
	 * @param context
	 * @param message
	 */
	public void addFacesMessages(String componentId, FacesContext context,
			String message);
	/**
	 * add message to context with specific Severity 
	 * @param severity INFO, WARN, ERROR 
	 * @param msg
	 */
	public void addMessageFaceContext(Severity severity, String message);
}
