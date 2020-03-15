package jlcLocalBlock;

public class Lab591_LocalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hello591 h =new Hello591();
		System.out.println("main method"+Hello591.a);
		
	}

}
class Hello591{
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
