package t12InnerClasses;

public class Lab_07_Outer {

	static int data=30;  
	  static class Inner{  
	   static void msg(){System.out.println("data is = "+data);}  
	  }  
	  public static void main(String args[]){  
		  Lab_07_Outer.Inner.msg();//no need to create the instance of static nested class  
	  } 
}
