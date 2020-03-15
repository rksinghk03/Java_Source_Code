package jlcOOPS;

public class Lab574_Final_Key_Initilization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello574 h= new Hello574();
		System.out.println("main method=" +h.a);
		System.out.println("main method=" +h.b);
	}

}
class Hello574{
	final int a; // The blank final field a may not have been initialized
	final int b=10;
}