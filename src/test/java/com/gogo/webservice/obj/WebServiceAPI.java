package com.gogo.webservice.obj;

import javax.jws.WebService;

@WebService(name = "WebServiceAPI", targetNamespace = "http://webservice.gogo.com/")
public interface WebServiceAPI {
	String getValue(String name);
}
