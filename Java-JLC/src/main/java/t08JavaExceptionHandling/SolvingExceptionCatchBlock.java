package t08JavaExceptionHandling;

public class SolvingExceptionCatchBlock {

	public static void main(String[] args) {
		
			int i=10; int j=0;
			try {
				double k=i/j;
			}
		catch(Exception e) {
			System.out.println("solving the exception in catch block ");
			  System.out.println(i/(j+2));  
		}

	}

}
