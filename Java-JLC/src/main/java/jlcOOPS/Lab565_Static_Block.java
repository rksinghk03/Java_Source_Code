package jlcOOPS;

public class Lab565_Static_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello16 h=null;
		System.out.println("Ref created");
		h=new Hello16();
	}

}
class Hello16{
	{
		System.out.println("Instance block");
	}
	static {
		System.out.println("Static block");
	}
}
// no out put of this pbogram