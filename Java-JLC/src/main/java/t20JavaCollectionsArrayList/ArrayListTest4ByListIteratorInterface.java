package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest4ByListIteratorInterface {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		
		al1.add("Raj");
		al1.add("Kumar");
		al1.add("Singh");
		al1.add("UP");
	    System.out.println("Traversing list through List Iterator:");  
        //Here, element iterates in reverse order  
           ListIterator<String> list1=al1.listIterator(al1.size());  
           while(list1.hasPrevious())  
           {  
               String str=list1.previous();  
               System.out.println(str);  
           }  
		System.out.println(al1);
	}

}
