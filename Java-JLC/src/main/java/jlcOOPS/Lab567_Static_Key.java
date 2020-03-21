package jlcOOPS;

public class Lab567_Static_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main methid = "+Hello567.a);
	}

}

class Hello567{
	
	static int a;
	{
		a=10;
		System.out.println("Instance Block");
	}
}