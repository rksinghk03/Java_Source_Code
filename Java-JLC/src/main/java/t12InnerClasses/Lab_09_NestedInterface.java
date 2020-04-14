package t12InnerClasses;

class A{  
	  interface Message{  
	   void msg();  
	  }  
	}  
	  
	class Lab_09_NestedInterface implements A.Message{  
	 public void msg(){System.out.println("Hello nested interface");}  
	  
	 public static void main(String args[]){  
	  A.Message message=new Lab_09_NestedInterface();//upcasting here  
	  message.msg();  
	 }  
	} 