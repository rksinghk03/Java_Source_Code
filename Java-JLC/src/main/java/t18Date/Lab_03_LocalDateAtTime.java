package t18Date;

import java.time.*;

public class Lab_03_LocalDateAtTime {

	  public static void main(String[] args) {  
		    LocalDate date = LocalDate.of(2020, 4, 5);  
		    LocalDateTime datetime = date.atTime(1,50,9);      
		    System.out.println(datetime);   
		  } 

}
