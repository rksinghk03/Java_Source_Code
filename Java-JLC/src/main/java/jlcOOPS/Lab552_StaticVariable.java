package jlcOOPS;

public class Lab552_StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hello5 h=new Hello5();
Hello5 h1=new Hello5();
System.out.println(h.b+"\t"+h1.b);
h.b=100;
System.out.println(h.b+"\t"+h1.b);
	}

}
class Hello5{
	static int b;
	
}