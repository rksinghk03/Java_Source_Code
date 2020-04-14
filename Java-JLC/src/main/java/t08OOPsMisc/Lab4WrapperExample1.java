package t08javaOOPsMisc;

public class Lab4WrapperExample1 {
	// Primitive to Wrapper 
	public static void main(String args[]) {
		int i =10;
		Integer n=100;
		System.out.println("Integer is = " +n);
		
		Integer j= Integer.valueOf(i);
		Integer k =j;
		System.out.println(i+ " " +j+ " "  +k);
	}

}
