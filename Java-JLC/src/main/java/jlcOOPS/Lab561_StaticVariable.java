package jlcOOPS;

public class Lab561_StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("In mail method class static value is ="+Hello12.a);
	}

}

class Hello12{
	static int a;
	{
		a=10;
		System.out.println("Static Initilized value="+a);
	}
}