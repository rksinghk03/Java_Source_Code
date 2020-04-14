package t09String;

import java.util.ArrayList;
import java.util.List;

public class EqualsIgnoreCaseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Manish Kumar";
		List<String>ls =new ArrayList<String>();
		   ls.add("Mohan");   
	        ls.add("Mukesh");  
	        ls.add("RAVI");  
	        ls.add("MaNIsh kuMar");  
	        ls.add("Suresh"); 
	
	for(String i:ls) {
	if(i.equalsIgnoreCase(str)) {
		System.out.println(str+  " is present in list");
	}
		
	}

}
}
