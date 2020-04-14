package t08JavaExceptionHandling;

public class MultipleCatchBlock1 {

	public static void main(String[] args) {
		try {
			int x=10/0;
			System.out.println(x);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
/*	Points to remember
	At a time only one exception occurs and at a time only one catch block is executed.
	All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.*/
}
