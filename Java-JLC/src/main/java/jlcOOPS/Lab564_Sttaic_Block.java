package jlcOOPS;

public class Lab564_Sttaic_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello15 h= null;
		System.out.println("Ref Created");
	}

}
class Hello15{
	
	static int a=0;
	{
		System.out.println("Instance block");
	}
	static {
		System.out.println("Static Block"); // it will not run because object is null;
	}
}