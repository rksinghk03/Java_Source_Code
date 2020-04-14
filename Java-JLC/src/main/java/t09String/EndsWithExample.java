package t09String;

public class EndsWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="rajksingh03@gmail.com";
		System.out.println(name.endsWith(".com"));
		System.out.println(name.endsWith("gmail.com"));
		
		 if(name.endsWith(".com")) {  
	            System.out.println("String ends with .com");  
	        }else System.out.println("It does not end with .com");  
	    }  
	

}
