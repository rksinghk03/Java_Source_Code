package com.rest;

public class UserDetails {
	int id;
	String name;
	int sal;

	public UserDetails(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return String.format("UserDetails [id=" + id + ", name=" + name + ", sal=" + sal + "]",+id, name, sal);
	}



}
