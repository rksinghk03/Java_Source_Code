package t09String;

public class ConcatExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi";
		String s1="How";
		String s2="are";
		String s3="you!";
		String s4=s.concat(s2);
		System.out.println(s4);
		String s5 = s.concat(s1).concat(s2).concat(s3);
		System.out.println(s5);
		
	}

}
