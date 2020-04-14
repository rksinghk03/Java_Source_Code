package t11ExceptionHandling;

public class Lab_22_ExceptionPropagation1 {
	
	 void m(){  
		    int data=50/0;  
		  }  
		  void n(){  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){
			   System.out.println("exception handled");
			   }  
		  }  
		  public static void main(String args[]){  
			  Lab_22_ExceptionPropagation1 obj=new Lab_22_ExceptionPropagation1();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  

}
