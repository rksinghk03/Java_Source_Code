package t09String;

public class ContainsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is best";
		boolean iscontains=s.contains("Java is best");
		System.out.println(iscontains);
		iscontains= s.contains("java is Best");
		System.out.println(iscontains);
	}

}
