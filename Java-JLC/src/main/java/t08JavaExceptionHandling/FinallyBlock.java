package t08JavaExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
			int i=3;
			int j=30/5;
			System.out.println(j);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally {
			System.out.println("finally block is always executed");
		}

	}
	/*Let's see the java finally example where exception doesn't occur.*/
}
