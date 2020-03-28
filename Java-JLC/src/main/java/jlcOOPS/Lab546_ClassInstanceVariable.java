package jlcOOPS;

public class Lab546_ClassInstanceVariable {

	public static void main(String[] args) {
		Hello a1=new Hello();
		Hello a2=new Hello();
		System.out.println(a1.a+ "\t"+a2.a);
		a1.a=99;
		System.out.println(a1.a+ "\t"+a2.a);
	}
}

class Hello{
	int a;
}