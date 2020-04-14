package t18Date;

import java.sql.Date;

public class Lab_39_SQLDateExample {
	public static void main(String[] args) {  
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis); 
        System.out.println("java.sql.Date Example: get current date");
        System.out.println(date); 
        
        System.out.println("Java String to java.sql.Date Example");
        String str="2015-03-31";  
        Date date1=Date.valueOf(str);//converting string into sql date  
        System.out.println(date1);  
    }  

}
