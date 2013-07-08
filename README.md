#Description
This API has objective to reduce quantity of code for internationalization using JSF. If you would like to avoid repetitive code and maintain code clear, this API can help you without missing make sense of your original code. 

##Why would I use this API? <br/>
Depends on of your situation, if you do not mind in write repetitive code, forget I4JSF, but if you would like to avoid write repetive code for internationalization message, I4JSF is for you. Normally, some teams create "Utility Classes" to avoid repetive code for your project, but if you are working in more one project that use JSF and need internationalization, how to avoid repetitive code for internationalization ? <br />

Writing again Util Java Class? (sometimes copy/paste of the other project). Is it not good right? If new functionallity is implemented how can you get it ? 

Because of this I4JSF was created with objective of fix this problem when we have more one project using Internationalization JSF and we would not to repeat common code, because it is very boring. 

#Support 
This API gives support JSF 1.2 or later. 

##Features
Check the features implemented according to [release](https://github.com/camilolopes/I4JSF-API.wiki.git)

##Example in Practice 

Normally using bundle your code appear something like this: 

##Native JSF
```java
FacesContext facesContext = FacesContext.getCurrentInstance();
	ResourceBundle bundle = facesContext.getApplication().getResourceBundle(facesContext, "language");
	String byndleKey = "msg.error";
	String msgBundle = bundle.getString(bundleKey);
	addFacesMessage(facesContext, msgBundle);
```	
##I4JSF API
```java
new I4JSF().addTranslateContext("language", "msg.error");
```

Inform internationalization variable  and bundle key. Like this your message is added the context JSF. 
Observe that we reduced from 4 lines to 1 line. 

#More information - Wiki
https://github.com/camilolopes/I4JSF-API/wiki

#Download Jar
https://github.com/camilolopes/I4JSF-API/tree/mvn-repo/com/i4jsf/i4jsf/

#Adding via maven 
https://github.com/camilolopes/I4JSF-API/wiki/adding-I4JSF-your-pom.xml

