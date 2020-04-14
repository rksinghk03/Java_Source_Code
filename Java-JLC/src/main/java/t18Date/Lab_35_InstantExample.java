package t18Date;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Lab_35_InstantExample {
	public static void main(String[] args) {  
	    Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");  
	    System.out.println(inst);
	    System.out.println("Java Instant Example: now()");
	    Instant instant = Instant.now();  
	    System.out.println(instant); 
	    System.out.println("***Java Instant Example: minus()");
	    instant = instant.minus(Duration.ofDays(125));  
	    System.out.println(instant); 
	    System.out.println("Example: plus() ");
	    Instant inst1 = Instant.parse("2017-02-03T11:25:30.00Z");  
	    Instant inst2 = inst1.plus(Duration.ofDays(125));  
	    System.out.println(inst2);   
	    System.out.println("Java Instant Example: isSupported()");
	    Instant inst4 = Instant.parse("2017-02-03T11:35:30.00Z");  
	    System.out.println(inst4.isSupported(ChronoUnit.DAYS));  
	    System.out.println(inst4.isSupported(ChronoUnit.YEARS));
	    
	  }  

}
