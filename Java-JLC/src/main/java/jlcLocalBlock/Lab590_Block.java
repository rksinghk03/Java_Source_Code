package jlcLocalBlock;

public class Lab590_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello590 h =new Hello590();
		System.out.println("Static Block"+h.a);
	}

}
class Hello590{
	static {
		int a =10;
		System.out.println("Static Block"+a);
	}
}