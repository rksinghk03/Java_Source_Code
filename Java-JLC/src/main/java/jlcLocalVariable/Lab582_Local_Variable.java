package jlcLocalVariable;

public class Lab582_Local_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello582 h=new Hello582();
	}

}
class Hello582{
	int a;
	static int b;
	{
		int c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}