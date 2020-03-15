package jlcLocalBlock;

public class Lab589_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello589 h=new Hello589();
	}

}

class Hello589{
	{
		int a=10;
		System.out.println("Intance Block 1"+a);
	}
	
	{
		System.out.println("Intance Block 1"+a);
	}
	
}