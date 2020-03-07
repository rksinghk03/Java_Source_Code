package com.rest.serviceCall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(RestTemplateApplication1.class);
	}
	@Bean
	public RestTemplate resttemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
