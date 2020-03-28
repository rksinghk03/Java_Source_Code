package jlcEnum;

public class EnumL1359WithEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("With Enum use L1357 ");
		Direction1 d1=null;
		//d1=new Direction("EAST",0);
			d1=Direction1.EAST;	
			System.out.println(d1);
			System.out.println(Direction1.NORTH);
			System.out.println(Direction1.WEST);
			System.out.println(Direction1.SOUTH);

	}

}

enum Direction1{
	EAST,NORTH,WEST,SOUTH;
	Direction1(){
		System.out.println("Direction() Def Cons**");
	}
	static {
		System.out.println("** Static block of Direction class");
	}
}
