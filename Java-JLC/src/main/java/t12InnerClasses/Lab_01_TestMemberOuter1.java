package t12InnerClasses;

public class Lab_01_TestMemberOuter1 {
	private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
		 Lab_01_TestMemberOuter1 obj=new Lab_01_TestMemberOuter1();  
		 Lab_01_TestMemberOuter1.Inner in=obj.new Inner();  
	  in.msg();  
	 }  

}
