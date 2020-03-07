package com.rest.user;
import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
public class User {

	  public User() {
	  
	 }
	 

	int id;
	@Size(min=2, message="Name should have atleast 2 characters")
	String name;
	@Past
	Date birthDate;
	
	public User(int id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	

	
}
