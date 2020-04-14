package t11ExceptionHandling;

import java.io.IOException;

class MM{  
	 void method()throws IOException{  
	  System.out.println("device operation performed");  
	 }  
	} 

public class Lab_26_Testthrows3 {

	   public static void main(String args[])throws IOException{//declare exception  
		     MM m=new MM();  
		     m.method();  
		  
		    System.out.println("normal flow...");  
		  } 
}
