package jlcLocalVariable;

public class Lab584_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main method "+Hello584.a);
	}

}

class Hello584{
	static int a;
	static {
		final int b=20;
		System.out.println(a);
		System.out.println(b);
	}
}