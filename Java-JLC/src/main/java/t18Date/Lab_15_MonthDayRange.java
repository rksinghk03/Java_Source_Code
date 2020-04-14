package t18Date;

import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class Lab_15_MonthDayRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MonthDay month = MonthDay.now();  
		    ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);  
		    System.out.println(r1);  
		    ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);  
		    System.out.println(r2);  
		    System.out.println("hello");
		  }  


}
