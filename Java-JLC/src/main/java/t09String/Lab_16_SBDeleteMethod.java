package t09String;

public class Lab_16_SBDeleteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb =new StringBuffer("Hello how are you!");
	//sb.replace(1, 3, "java");
	//System.out.println(sb);
		sb.delete(1, 4);
		System.out.println(sb);

	}

}
