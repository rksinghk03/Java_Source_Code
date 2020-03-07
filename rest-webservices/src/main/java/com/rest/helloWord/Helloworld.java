package com.rest.helloWord;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Helloworld {
	
	@Autowired
	private MessageSource messageSource; 

	
	@RequestMapping(method = RequestMethod.GET,path="/helomethod")
 public String hello() {
	 return "Hello world";
 }

	@GetMapping(path = "/himethod")
	 public String hi() {
		 return "Hello hi method";
	 }
	
	@GetMapping(path = "/hellowordbeans")
	 public Hellowordbeans hellowordbeans() {
		 return new Hellowordbeans ("hellowordbeans");
	 }
	///hellowordbeans/path-variable/rajkumar
	@GetMapping(path = "/hellowordbeans/path-variable/{name}")
	 public Hellowordbeans hellowordPathVariable(@PathVariable String name) {
		 return new Hellowordbeans (String.format("helloword using PathVariables, %s",name));
	 }
	
	///hello-world/path-variable/in28minutes
		@GetMapping(path = "/hello-world/path-variable/{name}")
		public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
			return new HelloWorldBean(String.format("Hello World, %s", name));
		}

	
	/*
	 * @GetMapping(path = "/hello-world-internationalized") public String
	 * helloWorldInternationalized() { return "good morning"; }
	 * 
	 */	

	/*
	 * @GetMapping(path = "/hello-world-internationalized") public String
	 * helloWorldInternationalized() { return
	 * messageSource.getMessage("good.morning.message", null,
	 * LocaleContextHolder.getLocale()); }
	 */
		@GetMapping(path = "/hello-world-internationalized")
		public String helloWorldInternationalized(@RequestHeader(name="Accept-Langauge", required= false) Locale locale) {
			return messageSource.getMessage("good.morning.message", null, 
										LocaleContextHolder.getLocale());
		}

}
