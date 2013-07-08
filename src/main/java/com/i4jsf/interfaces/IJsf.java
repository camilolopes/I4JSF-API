package com.i4jsf.interfaces;

import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public interface IJsf {

	public void addTranslateContext(String bundleVar, String keyProperties);

	public void addTranslateContext(String componentId, String bundleVar,
			String keyProperties);

	public void addMessageFaceContext(String idComponent, Severity severity,
			String message);

	public void addFacesMessages(FacesContext context, String message);

	public void addFacesMessages(String componentId, FacesContext context,
			String message);

	public void addMessageFaceContext(Severity severity, String message);
}
