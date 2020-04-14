package t11ExceptionHandling;

public class Lab_04_TryCatchExample3 {

	public static void main(String[] args) {
		try {
		int y=10/0;
		System.out.println(y);
		}
		//System.out.println("Hello TryCatchExample3 when expection occur from that line other code will not excute");
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Hello TryCatchExample3 when expection occur from that line other code will not excute");

	}

}
