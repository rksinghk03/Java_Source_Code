package t06Encapsulation;
class A{
	private int a=10;
	private void msg() {
		System.out.println("hello message");
	}
}
public class Lab_01_PrivateAccessModifier {

	public static void main(String[] args) {
		A n =new A();
		n.msg(); //Compile time error
		System.out.println(n.a);//Compile Time Error  
		
		
		

	}

}
