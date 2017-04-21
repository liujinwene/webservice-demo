package com.gogo.webservice;

import javax.jws.WebService;

@WebService
public class WebServiceObj {
	public String getValue(String name) {
		return "My name is " + name;
	}

}
