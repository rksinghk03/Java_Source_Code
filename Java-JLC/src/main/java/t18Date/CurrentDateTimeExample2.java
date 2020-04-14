package t18Date;

import java.text.SimpleDateFormat;  
import java.util.Date;  
public class CurrentDateTimeExample2 {  
public static void main(String[] args) {  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    System.out.println(formatter.format(date));  
    System.out.println("Get Current Date: java.time.LocalDate");
    System.out.println(java.time.LocalDate.now()); 
    System.out.println("Get Current Time: java.time.LocalTime");
    System.out.println(java.time.LocalTime.now());  
    System.out.println("Get Current Date & Time: java.time.LocalDateTime");
    System.out.println(java.time.LocalDateTime.now());
    System.out.println("Get Current Date & Time: java.time.Clock");
    System.out.println(java.time.Clock.systemUTC().instant()); 
    
    
}  
}  
