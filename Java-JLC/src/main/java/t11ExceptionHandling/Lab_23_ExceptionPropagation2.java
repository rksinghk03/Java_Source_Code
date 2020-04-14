package t11ExceptionHandling;

public class Lab_23_ExceptionPropagation2 {
	 void m(){  
		    throw new java.io.IOException("device error");//checked exception  
		  }  
		  void n(){  
		    m();  
		  }  
		  void p(){  
			  try{  
				  	n();  
			  }
		   catch(Exception e){
			   System.out.println("exception handeled");
			   }  
		  }  
		  public static void main(String args[]){  
			  Lab_23_ExceptionPropagation2 obj=new Lab_23_ExceptionPropagation2();  
			  obj.p();  
			  System.out.println("normal flow");  
		  }  

}
