package jlcLocalBlock;

public class Lab586_Multiple_Static_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello586 h =new Hello586();
		System.out.println("Main methid ="+h.a);
	}

}

class Hello586{
	static int a=10;
	static {
		System.out.println("Static block 1"+a);
	}
	static {
		System.out.println("Static block 2"+a);
	}
}