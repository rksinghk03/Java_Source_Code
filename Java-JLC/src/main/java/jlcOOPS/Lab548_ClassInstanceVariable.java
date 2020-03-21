package jlcOOPS;

public class Lab548_ClassInstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hello2 h=new Hello2();
		Hello2 h=null; // java.lang.NullPointerException
		System.out.println(h.a);
	}

}

class Hello2{
	
	int a;
	
}