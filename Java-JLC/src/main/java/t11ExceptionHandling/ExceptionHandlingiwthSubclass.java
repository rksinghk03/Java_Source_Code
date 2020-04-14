package t11ExceptionHandling;


class Parent{  
	  void msg()throws ArithmeticException{
		  System.out.println("parent");}  
	}  
	  
	class ExceptionHandlingiwthSubclass extends Parent{  
	  void msg()throws Exception{System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent p=new ExceptionHandlingiwthSubclass();  
	   try{  
	   p.msg();  
	   }catch(Exception e){}  
	  }  
	}  