package jlcOOPS;

public class Lab568_Static_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello568 h=new Hello568();
		System.out.println("main method="+Hello568.a);
		
	}

}

class Hello568{
	static int a;
	{
		a=10;
		System.out.println("Instance Block");
	}
}