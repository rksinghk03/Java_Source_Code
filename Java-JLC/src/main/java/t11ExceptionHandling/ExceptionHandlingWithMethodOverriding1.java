package t11ExceptionHandling;
 
	  
	class ExceptionHandlingWithMethodOverriding1 extends Parent{  
	  void msg()throws ArithmeticException{  
	    System.out.println("child");  
	  }  
	  public static void main(String args[]){  
	   Parent p=new ExceptionHandlingWithMethodOverriding1();  
	   p.msg();  
	  }  
	}  