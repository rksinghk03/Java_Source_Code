package t18Date;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Lab_31_YearMonth {
	public static void main(String[] args) {  
		  YearMonth ym = YearMonth.now();  
		  System.out.println("Checking year and month using YearMonth.now()= "+ym); 
		  String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));  
		    System.out.println("YearMonth format()="+s);  
		    long l1 = ym.get(ChronoField.YEAR);  
		    System.out.println("geting only year = " +l1);  
		    long l2 = ym.get(ChronoField.MONTH_OF_YEAR);  
		    System.out.println("getiing only month = " +l2);  
	}

}
