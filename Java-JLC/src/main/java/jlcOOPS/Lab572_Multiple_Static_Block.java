package jlcOOPS;

public class Lab572_Multiple_Static_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main method "+Hello572.a);
	}

}
class Hello572{
	static int a;
	static {
		System.out.println("Static Block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}
}
