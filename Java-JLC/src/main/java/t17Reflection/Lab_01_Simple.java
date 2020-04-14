package t17Reflection;

public class Lab_01_Simple {
	public static void main(String[] args) {
		try {
		Class c=Class.forName("Test");
		//System.out.println("Lab_01_Simple");
		System.out.println(c.getName());
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
