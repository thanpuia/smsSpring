package com.example.test.smstest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

	@GetMapping("/remi")
	public String test() {
	//	https://instantalerts.co/api/web/send?apikey=6n7h4wv5yte7t87qxp4vmrfh96tu0el7&sender=SEDEMO&to=919632xxxxxx&message=Hi%2C+this+is+a+test+message
		getEmployees();
		return "hello there";
	}
	
	/*
	 * public void getEmployees() { final String uri =
	 * "https://instantalerts.co/api/web/send?apikey=6n7h4wv5yte7t87qxp4vmrfh96tu0el7&sender=SEDEMO&to=7810911046&message=Hi%2C+this+is+a+test+oyessss";
	 * 
	 * RestTemplate restTemplate = new RestTemplate(); String result =
	 * restTemplate.getForObject(uri, String.class);
	 * 
	 * System.out.println(result); }
	 */
	private static void getEmployees()
	{
		
		String message ="Locality" + " Landmark"+" Material " + " Quantity" + "Name:" + " Phone"+"Zonal Officer Contact" + "Zonal Officer Name";
		
		
	    final String uri = "https://instantalerts.co/api/web/send?apikey=6n7h4wv5yte7t87qxp4vmrfh96tu0el7&"
	    		+ "sender=SEDEMO&to=7810911046&message=Hi%2C+this+is+a+test+oyessss";

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    System.out.println(result);
	}
}
