package t11ExceptionHandling;

public class Lab_14_MultipleCatchBlock3 {

	public static void main(String[] args) {
		System.out.println("MultipleCatchBlock3");
		try {

			 int x=10/0;
			 System.out.println(x);
		}
		
 catch(Exception e) {
	 System.out.println(e);
 }
	}

}
