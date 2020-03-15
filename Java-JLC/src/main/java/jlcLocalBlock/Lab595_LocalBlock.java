package jlcLocalBlock;

public class Lab595_LocalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello595 h=new Hello595();
		System.out.println("Main method"+h.a);
	}

}

class Hello595{
	{
	int a=10;
	String a="JLC";
	System.out.println("I am in Block 1"+a);
}
}