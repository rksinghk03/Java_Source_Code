package t11ExceptionHandling;

public class UncheckedException {

	public static void main(String[] args) {
		try {
			System.out.println("unchecked exception.");
			int x[]= {1,2,3,4,5};
					System.out.println(x[10]);
		}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
	}

}
