package t09String;

public class Lab_05_ComparebyEqualoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Ramkumar";
		String s2="Ramkumar";
		String s3= new String("Ramkumar");
		System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool
		
		

	}

}
