package t14InputOutput;

import java.io.Console;

public class Lab_16_ReadPassword {
	public static void main(String args[]){    
		Console c=System.console();    
		System.out.println("Enter password: ");    
		char[] ch=c.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass);    
		}    

}
