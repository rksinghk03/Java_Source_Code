package t09String;

import java.util.ArrayList;
import java.util.List;

public class EqualsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		List<String>ls=new ArrayList<String>();
		
		ls.add("java");
		ls.add("C");
		ls.add("C++");
		ls.add("Java Script");
		
		for(String i:ls) {
			//System.out.println(i);
			if(i.equals(str)) {
				System.out.println("String "+str+" is present in array list");
			}
		}
		
	}

}
