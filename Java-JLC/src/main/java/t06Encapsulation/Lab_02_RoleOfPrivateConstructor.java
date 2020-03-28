package t06Encapsulation;
// If you make any class constructor private, you cannot create the instance of that class from outside the class.
//For example
class Test2{
	
	private Test2(){
		System.out.println("Private constructor");
	}
	void msg() {
		System.out.println("Hello msg");
	}
}
public class Lab_02_RoleOfPrivateConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Test2 n =new Test2();
 n.msg();
 
	}
}
