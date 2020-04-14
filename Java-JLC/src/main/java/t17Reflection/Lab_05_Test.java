package t17Reflection;


public class Lab_05_Test {
  
	 public static void main(String args[]){  
	  try{  
	  Class c=Class.forName("Simple");  
	  Simple s=(Simple)c.newInstance();  
	  s.message();  
	  
	  }catch(Exception e){System.out.println(e);}  
	  
	 }  
}