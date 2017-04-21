package com.gogo.webservice;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import com.gogo.webservice.obj.WebServiceAPI;

public class WebServiceTest {
	@Test
	public void test1() throws Exception {
		URL wsdlUrl = new URL("http://localhost:8580/test?wsdl");
		Service s = Service.create(wsdlUrl, new QName("http://webservice.gogo.com/","WebServiceObjService"));
		WebServiceAPI hs = s.getPort(new QName("http://webservice.gogo.com/","WebServiceObjPort"), WebServiceAPI.class);
		String ret = hs.getValue("张建");
		System.out.println(ret);
	}
}
