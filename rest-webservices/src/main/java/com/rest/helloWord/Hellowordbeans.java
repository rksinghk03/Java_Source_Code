package com.rest.helloWord;

public class Hellowordbeans {

	private String message;

	
	
	public Hellowordbeans(String message) {
		super();
		this.message = message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getMessage() {
		return message;
	}



	@Override
	public String toString() {
		return "Hellowordbeans [message=" + message + "]";
	}
	

}
