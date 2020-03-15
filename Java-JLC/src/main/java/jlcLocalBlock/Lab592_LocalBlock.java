package jlcLocalBlock;

public class Lab592_LocalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Hello592();
System.out.println("Hello Hello592");
	}

}

class Hello592{
	static int a;
	{
		System.out.println("I am in IIB");
		{
			System.out.println("I am in IIB Local block");
		}
	}
	static {
		System.out.println("I am in  SIB");
		{
			System.out.println("I am in Local block of SIB");
		}
	}
}
