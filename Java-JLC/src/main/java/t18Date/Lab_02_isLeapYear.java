package t18Date;

import java.time.LocalDate;

public class Lab_02_isLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d= LocalDate.of(2017, 1, 13);
		System.out.println(d.isLeapYear());
		LocalDate d1= LocalDate.of(2016, 9, 23);
		System.out.println(d1.isLeapYear());

	}

}
