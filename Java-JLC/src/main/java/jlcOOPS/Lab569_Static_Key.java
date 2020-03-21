package jlcOOPS;

public class Lab569_Static_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method="+Hello569.a);
		//System.out.println("Main method="+Hello569.b); we can not access b/s its not static 
	}

}
class Hello569 {
	
	static int a;
	int b;
	{
		a=10;
		b=20;
		System.out.println("Static Block");
	}
}
