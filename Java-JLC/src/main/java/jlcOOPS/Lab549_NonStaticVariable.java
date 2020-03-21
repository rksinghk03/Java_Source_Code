package jlcOOPS;

public class Lab549_NonStaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(Hello3.a); // Cannot make a static reference to the non-static field Hello3.a
	}

}

class Hello3{
	
	int a;
}