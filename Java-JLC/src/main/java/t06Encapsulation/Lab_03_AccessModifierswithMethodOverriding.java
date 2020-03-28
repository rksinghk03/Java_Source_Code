package t06Encapsulation;
class A3{
	protected void msg() {
		System.out.println("protected method");
	}
}


public class Lab_03_AccessModifierswithMethodOverriding extends A3 {
	 void msg() {
		System.out.println("Helo class Lab03");
	}
	public static void main(String arg[]) {
	Lab_03_AccessModifierswithMethodOverriding n=new Lab_03_AccessModifierswithMethodOverriding();
	n.msg();
	A3 n1=new A3();
	n1.msg();
}
}