package t08JavaExceptionHandling;

public class TryCatchExample1 {

	public static void main(String[] args) {
		try {
		int x=100/0;
		System.out.println(x);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
