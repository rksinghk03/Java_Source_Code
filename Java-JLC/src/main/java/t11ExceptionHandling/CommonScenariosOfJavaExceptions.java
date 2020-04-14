package t11ExceptionHandling;

public class CommonScenariosOfJavaExceptions {

	public static void main(String[] args) {
		//int i=100/0;
		String i=null;
		
		int a[]=new int[5];  
		 //ArrayIndexOutOfBoundsException  

		try {
			System.out.println(i);
			//System.out.println(i.length());
			//int j=Integer.parseInt(i);
			a[10]=50;
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
