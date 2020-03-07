package com.rest.serviceCall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class RestTemplateApplication {
	private static final Logger log = LoggerFactory.getLogger(RestTemplate.class);
	public static void main(String args[]) {
	RestTemplate restTemplate =new RestTemplate();
	//String quote = restTemplate.getForObject("http://localhost:8090/books", String.class);
	String quote = restTemplate.getForObject("http://localhost:8090/users", String.class);
	
	log.info(quote.toString());
	}
}
