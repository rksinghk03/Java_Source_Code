package t11ExceptionHandling;

import java.io.IOException;

public class Lab_24_Testthrows1 {
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  Lab_24_Testthrows1 obj=new Lab_24_Testthrows1();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  

}
