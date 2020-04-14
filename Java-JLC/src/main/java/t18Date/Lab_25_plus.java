package t18Date;

import java.time.Period;
import java.time.ZonedDateTime;

public class Lab_25_plus {

	  public static void main(String[] args) {  
		    ZonedDateTime zone= ZonedDateTime.now();  
		    ZonedDateTime p = zone.plus(Period.ofDays(111));  
		    System.out.println(p);  
		  } 
}
