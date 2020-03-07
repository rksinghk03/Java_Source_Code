package com.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {
	
	@GetMapping("/users")
	public List<UserDetails> getAllUsers() {
		return Arrays.asList(
				new UserDetails(1, "Rajkumar", 20));
	}

}
