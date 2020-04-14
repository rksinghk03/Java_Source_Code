package t11ExceptionHandling;

import java.io.IOException;

class Parent{  
	  void msg(){System.out.println("parent");}  
	} 

public class ExceptionHandlingWithMethodOverriding extends Parent {

		  void msg()throws IOException{  
		    System.out.println("TestExceptionChild");  
		  }  
		  public static void main(String args[]){  
		   Parent p=new ExceptionHandlingWithMethodOverriding();  
		   p.msg();  
		  } 

}
