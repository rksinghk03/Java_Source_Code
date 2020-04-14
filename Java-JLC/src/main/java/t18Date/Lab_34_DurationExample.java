package t18Date;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Lab_34_DurationExample {
	 public static void main(String[] args) {  
		    Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
		    System.out.println("duration of time = "+d.get(ChronoUnit.SECONDS)); 
		    
		    Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);  
		      System.out.println("duration of time between ="+ d1.isNegative());  
		      Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
		              System.out.println("duration of time between = "+d2.isNegative());  
		              System.out.println("Use of minus method");
		              Duration d3 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
		              System.out.println(d1.getSeconds());  
		              Duration d4 = d3.minus(d3);  
		              System.out.println(d4.getSeconds()); 
		              System.out.println("Use of plus method");
		              Duration dp = Duration.between(LocalTime.NOON,LocalTime.MAX);  
		              System.out.println(d1.getSeconds());  
		              Duration dp2 = dp.plus(dp);  
		              System.out.println(dp2.getSeconds()); 
	 }

}
