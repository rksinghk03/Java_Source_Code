package jlcLocalBlock;

public class Lab587_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello587 h=new Hello587();

	}

}
class Hello587{
	int a=10;
	{
		System.out.println("Instance Block 1 "+a);
	}
	
	{
		String a="JLC";
		System.out.println("Instance Block 2 "+a);
	}
}