package jlcEnum;

public class EnumL1357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("With out  Enum use ");
Direction d1=null;
//d1=new Direction("EAST",0);
	d1=Direction.EAST;	
	System.out.println(d1);
	System.out.println(Direction.NORTH);
	System.out.println(Direction.WEST);
	System.out.println(Direction.SOUTH);
	
	
		
	}

}


class Direction{
	public static Direction EAST = new Direction("EAST",0);
	public static Direction NORTH = new Direction("EAST",90);
	public static Direction WEST = new Direction("WEST",180);
	public static Direction SOUTH = new Direction("SOUTH",270);
	
	static  {
		System.out.println("Sttaic block in Direction class");
	}
	
	private String name;
	private int angle;
	
private Direction (String name,int angle) {
	
		this.name = name;
		this.angle = angle;
		System.out.println("Direction(String,int)");
	}

public int getAngle() {
	return angle;
}

@Override
public String toString() {
	return "Direction [angle=" + angle + "]";
}

	
	
}


