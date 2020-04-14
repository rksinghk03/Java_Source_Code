package t14InputOutput;

import java.io.Console;
import java.io.IOException;

public class Lab_15_Console  {
	public static void main(String args[]) throws IOException{  
		try {
		Console c=System.console();    
		System.out.println("Enter your name: \n");    
		String n=c.readLine();    
		//System.out.println("Welcome "+n);    
		 
	}catch(Exception e){
		System.out.println(e);
	}
	}
}
