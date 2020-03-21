package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListTest7ByforEachRemainingMethod {

	public static void main(String[] args) {
		
		Collection<String> al1=new ArrayList<>();
		
		al1.add("Raj");
		al1.add("Kumar");
		al1.add("Singh");
		al1.add("UP");
		  System.out.println("Traversing list through forEachRemaining() method:");  
          Iterator<String> itr=al1.iterator();  
          itr.forEachRemaining(a-> //Here, we are using lambda expression  
          {  
        System.out.println(a);  
          });  
		System.out.println(al1);
	}

}
