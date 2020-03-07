package com.rest.serviceCall;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class RestTemplateServiceCall {
	
	private RestTemplate template;
	public RestTemplateServiceCall(RestTemplate template) {
		this.template= template;

	}
	@RequestMapping("/template")
		public String hello() {
		String message=this.template.getForObject("http://localhost:8090/books", String.class);
				return message;
	}
}
	
