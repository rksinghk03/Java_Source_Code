package jlcOOPS;

public class Lab551_StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hello4 h=new Hello4();
System.out.println(h.a);
h.a=99;
System.out.println(h.a);
	}

}
class Hello4{
	
	static int a;
}