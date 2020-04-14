package t18Date;

import java.time.LocalDate;
import java.time.Year;

public class Lab_30_Year {
	public static void main(String[] args) {
		Year y =Year.now();
		System.out.println("Year of now= " +y);
		
		  Year atDay = Year.of(2020);  
		    LocalDate l = atDay.atDay(123);  
		    System.out.println("date of atDay = "+l); 
		    
		    System.out.println("Total day in year using lenght() = "+atDay.length()); 
		      
		    System.out.println("chekcing year using isLeap() "+atDay.isLeap()); 
	}

}
