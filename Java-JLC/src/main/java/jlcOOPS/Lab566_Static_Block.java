package jlcOOPS;

public class Lab566_Static_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello17 h=new Hello17();
		new Hello17();
	}

}

class Hello17{
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}
}