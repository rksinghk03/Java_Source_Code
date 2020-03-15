package jlcLocalVariable;

public class Lab580_Local_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main method");
Hello580 h=new Hello580();
	}

}
class Hello580{
	int a=10;
	static int b=20;
	{
		int c=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}