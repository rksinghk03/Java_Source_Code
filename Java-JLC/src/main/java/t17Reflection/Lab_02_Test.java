package t17Reflection;

public class Lab_02_Test {
	  void printName(Object obj){  
		  Class c=obj.getClass();    
		  System.out.println(c.getName());  
		  }  
		  public static void main(String args[]){  
		   Test s=new Test();  
		   
		   Lab_02_Test t=new Lab_02_Test();  
		   t.printName(s);  
		 }  

}
