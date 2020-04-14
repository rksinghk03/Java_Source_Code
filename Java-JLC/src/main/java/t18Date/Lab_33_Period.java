package t18Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class Lab_33_Period {
	  public static void main(String[] args) {  
		    Period period = Period.ofDays(90);  
		    Temporal temp = period.addTo(LocalDate.now());  
		    System.out.println("use of OfDays= " +temp);  
		    Period off = Period.of(2017,02,16);  
		    System.out.println(off.toString());  
		    
		    Period period1 = Period.ofMonths(4);   
		    Period period2 = period1.minus(Period.ofMonths(2));  
		    System.out.println("Use of minus ()="+period2);
		    
		    
		    Period pom = Period.ofMonths(4);   
		    Period pom2 = pom.plus(Period.ofMonths(2));  
		    System.out.println("use of plus()= "+pom2);  
		    
		  } 

}
