package jlcOOPS;

public class Lab575_Final_Key_Initilization {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Hello575 h= new Hello575();
			System.out.println("main method=" +h.a);
			System.out.println("main method=" +h.b);
		}

	}
	class Hello575{
		final int a=20; // The blank final field a may not have been initialized
		final int b=10;
	}

