package jlcOOPS;

public class Lab562_Static_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("in main method = "+Hello13.a);
	}

}

class Hello13{
	static int a;
	static {
		a=10;
		System.out.println("Static block value="+a);
	}
}