package jlcLocalBlock;

public class Lab588_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello588 h=new Hello588();

	}

}
class Hello588{
	
	{
		int a=10;
		System.out.println("Instance Block 1 "+a);
	}
	
	{
		System.out.println("Instance Block 2 "+a);
	}
}