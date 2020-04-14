package t18Date;

public class Lab_38_UtilDate {
		public static void main(String[] args) {
	    long millis=System.currentTimeMillis();  
	    java.util.Date date=new java.util.Date(millis);  
	    System.out.println(date);
	    System.out.println("2nd Way");
	    java.util.Date date1=new java.util.Date();  
	    System.out.println(date1);  
	}
}
