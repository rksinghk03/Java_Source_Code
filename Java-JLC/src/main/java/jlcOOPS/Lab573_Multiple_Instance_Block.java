package jlcOOPS;

public class Lab573_Multiple_Instance_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello573 h=new Hello573();
		System.out.println("Main method");

	}

}

class Hello573{
	{
		System.out.println("Instance Block 1");
	}
	
	{
		System.out.println("Instance Block 2");
	}
}