package t12InnerClasses;

public class Lab_06_Outer {

	static int data=30;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
		  Lab_06_Outer.Inner obj=new Lab_06_Outer.Inner();  
	  obj.msg();  
	  }
}
