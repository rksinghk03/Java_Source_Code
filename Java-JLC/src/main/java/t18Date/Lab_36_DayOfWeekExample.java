package t18Date;

import java.time.*;
import java.time.temporal.ChronoField;


public class Lab_36_DayOfWeekExample {
	 public static void main(String[] args) {  
		    LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 25);  
		    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
		    System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));  
		    System.out.println("Java DayOfWeek Example: of()");
		    DayOfWeek day = DayOfWeek.of(5);  
		    System.out.println(day.name());  
		    System.out.println(day.ordinal());  
		    System.out.println(day.getValue());  
		    System.out.println("Java DayOfWeek Example: plus()");
		    
		    LocalDate date = LocalDate.of(2017, Month.JANUARY, 31);  
		    DayOfWeek day1 = DayOfWeek.from(date);  
		    System.out.println(day.getValue());  
		    day1 = day1.plus(3);  
		    System.out.println(day1.getValue());  
		    System.out.println("Java DayOfWeek Example: minus()");
		    LocalDate date2 = LocalDate.of(2017, Month.JANUARY, 31);  
		    DayOfWeek day2 = DayOfWeek.from(date);  
		    System.out.println(day2.getValue());  
		    day2 = day2.minus(3);  
		    System.out.println(day2.getValue());  
		    
		  
		  }  

}
