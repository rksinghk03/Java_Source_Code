package jlcOOPS;

public class Lab563_Static_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Hello14.a);
System.out.println(Hello14.a);
	}

}

class Hello14{
	static int a=10;
	{
		System.out.println("Instance block"); // it will not run
	}
	
	static {
		System.out.println("Static block");
	}
}