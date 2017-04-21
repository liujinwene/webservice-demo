package com.gogo.webservice;

import javax.xml.ws.Endpoint;

public class WebServiceMain {
	public static void main(String[] args) throws Exception {
		Endpoint.publish("http://localhost:8580/test", new WebServiceObj());
		System.out.println("service success!");
	}
}
