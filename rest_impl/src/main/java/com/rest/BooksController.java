package com.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/")
	public void hello() {
		System.out.println("hello rest_imp applications");
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(11, "Mastering Spring 5.2", " By Ranga Karanam"));
	}
}