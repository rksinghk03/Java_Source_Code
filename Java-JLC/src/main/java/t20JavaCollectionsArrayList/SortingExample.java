package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortingExample {

	public static void main(String[] args) {
		System.out.println("Hello Array list");

		ArrayList<Integer> alint=new ArrayList<Integer>();
		alint.add(10);
		alint.add(20);
		alint.add(10);
		alint.add(50);
		alint.add(40);
		alint.add(60);
		System.out.println("Array list value="+alint);
		/*alint.sort((Comparator<al>) alint);*/
		
		Set <Integer> set1=new HashSet<Integer>(alint);
		System.out.println(set1);
		alint.clear();
		alint.addAll(set1);
		System.out.println("list = "+set1);
		
		

		 ArrayList<String> lst = new ArrayList<String>();
		    lst.add("ABC");
		    lst.add("ABC");
		    lst.add("ABCD");
		    lst.add("ABCD");
		    lst.add("ABCE");

		    System.out.println("Duplicates List "+lst);

		    Object[] st = lst.toArray();
		    System.out.println("Object is = "+st);
		      for (Object s : st) {
		        if (lst.indexOf(s) != lst.lastIndexOf(s)) {
		            lst.remove(lst.lastIndexOf(s));
		         }
		      }

		    System.out.println("Distinct List "+lst);
	}

}
