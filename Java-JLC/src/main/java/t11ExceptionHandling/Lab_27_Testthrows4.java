package t11ExceptionHandling;

import java.io.IOException;

class M4{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
	class Lab_27_Testthrows4{  
	   public static void main(String args[])throws IOException{//declare exception  
	     M4 m=new M4();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	   }
	}