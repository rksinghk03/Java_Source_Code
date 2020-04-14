package t12InnerClasses;
abstract class  Person{
	 abstract void eat();
 }
public class Lab_02_AnonymousInner {
	public static void main(String args[]){  
		  Person p=new Person(){  
		  void eat(){System.out.println("nice fruits");}  
		  };  
		  p.eat();  
		 }  

}
