package jlcOOPS;

public class Lab570_Static_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello570 h=new Hello570();
		System.out.println("main method="+h.a+"\t"+h.b);
	}

}

class Hello570{
	static int a;
	int b;
	static {
		a=10;
		
		Hello570 h=new Hello570();
		h.b=20;
		System.out.println("Static Block="+h.a+"\t"+h.b);
	}
}