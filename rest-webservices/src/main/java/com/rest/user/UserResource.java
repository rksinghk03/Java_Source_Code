package com.rest.user;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;
import org.springframework.hateoas.*;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rest.exception.CustomizedResponseEntityExceptionHandler;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}
	
	  // Find user by id simple method
	  
	 @GetMapping("/users/{id}") public User retfiveUser(@PathVariable int id) {
	 //return service.findOne(id); 
	User user=service.findOne(id);
	if(user==null)
	 throw new UserNotFoundException("id-"+id); 
	 return user;
	 
	  }
	 
	
	// HATEOAS
	/*
	 * @GetMapping("/users/{id}") public Resource<User> retrieveUser(@PathVariable
	 * int id) { User user = service.findOne(id);
	 * 
	 * if(user==null) throw new UserNotFoundException("id-"+ id);
	 * 
	 * 
	 * //"all-users", SERVER_PATH + "/users" //retrieveAllUsers Resource<User>
	 * resource = new Resource<User>(user);
	 * 
	 * ControllerLinkBuilder linkTo =
	 * linkTo(methodOn(this.getClass()).retrieveAllUsers());
	 * 
	 * resource.add(linkTo.withRel("all-users"));
	 * 
	 * //HATEOAS
	 * 
	 * return resource; }
	 */

	
	
	// Delete a user use post man delete method
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		User user = service.deleteById(id);
		
		if(user==null)
			throw new UserNotFoundException("id-"+ id);		
	}
	
// save use using validation @Valid to validate user size is min =2
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
		User savedUser=service.save(user);
		// We use to send responce code 201 when user is created
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();
			
			return ResponseEntity.created(location).build();
	   }

	
}
