package t11ExceptionHandling;

public class Lab_19_FinallyBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=10/0;
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			//System.exit(1);
			System.out.println("alway runs");	
		}
	}

}
