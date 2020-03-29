package t09String;

public class Lab_10_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Suman";
		System.out.println("String value="+a.charAt(0));
		System.out.println("String value = "+a.charAt(4));
		System.out.println("String value = "+a.charAt(8)); // error  java.lang.StringIndexOutOfBoundsException: String index out of range: 8

	}

}
