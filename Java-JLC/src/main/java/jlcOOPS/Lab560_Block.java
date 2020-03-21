package jlcOOPS;

public class Lab560_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello11 h=new Hello11();
		System.out.println("main method = " +h.a);
	}

}

class Hello11{
	int a;
	{
		a=10;
		System.out.println("Initilized valued ="+a);
	}
}