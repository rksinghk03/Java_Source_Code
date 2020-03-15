package jlcOOPS;

public class Lab576_Final_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello576 h=new Hello576();
		System.out.println("main method= "+h.a);
	}

}

class Hello576{
	final int a;
	{
		a=10;
	}
}