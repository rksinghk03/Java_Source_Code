package jlcLocalVariable;

public class Lab583_Local_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello583 h=new Hello583();
	}

}

class Hello583{
	static int a;
	static {
		static int b; // Invalid 
		System.out.println(a);
		System.out.println(b);
		
	}
}
