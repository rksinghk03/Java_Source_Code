package t08OOPsMisc;

 class Base {
	
	void show() {
		System.out.println("Hello base class");
}

}
 class Child extends Base{
	void show() {
		System.out.println("Hello child  class");
		
super.show();
 }
 }
	
public class MethodOverriding extends Base {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Overloading obj=new Overloading();
		Child obj1=new Child ();
		
		obj1.show();
	
		
	}

}
