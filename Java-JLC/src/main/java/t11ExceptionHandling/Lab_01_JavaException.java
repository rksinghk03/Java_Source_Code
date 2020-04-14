package t11ExceptionHandling;

public class Lab_01_JavaException {

	public static void main(String[] args) {
		int i=100/0;
		try {
			System.out.println(i);
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
		System.out.println("rset of code");
	}
	
}
