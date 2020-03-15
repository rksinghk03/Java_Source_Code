package jlcLocalBlock;

public class Lab585_Multiple_InstanceBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello585 h=new Hello585();
		System.out.println("main method "+h.a);

	}

}
class Hello585{
	int a=10;
	{
		System.out.println("Instance Block one "+a);
	}
	{
		System.out.println("Instance Block two "+a);
	}
}