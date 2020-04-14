package t18Date;

import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class Lab_27_ZoneId_systemDefault {
	public static void main(String[] args) {
		
	
	ZoneId zone=ZoneId.systemDefault();
	String s=zone.getId();
	
	System.out.println(zone);
	System.out.println(s);
	System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT)); 
	}

}
