package jlcEnum;

public class EnumL1360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Use of ENUM using array and Expection");
 
 Direction2 arr[]= Direction2.values();
 for(Direction2 d:arr) {
	 System.out.println(d.ordinal()+"\t"+ d.name());
 }
	Direction2 d =Direction2.valueOf("EAST");
	System.out.println(d);

}
}

enum Direction2{
	EAST(0),NORTH(90),WEST(180),SOUTH(270);
	int angle;
	Direction2 (int angle){
		this.angle=angle;
		System.out.println("Direction() Def Cons**");
	}
	
	static {
		      System.out.println("** Static block of Direction class");
	      }
}
