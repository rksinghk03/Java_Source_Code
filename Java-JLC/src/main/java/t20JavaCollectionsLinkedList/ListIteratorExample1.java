package t20JavaCollectionsLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("raj");
		al.add("kumar");
		al.add("singh");
		System.out.println("array list = "+al);
		ListIterator<String> itr=al.listIterator();
		  System.out.println("Traversing elements in forward direction");    
		while(itr.hasNext()) {
			System.out.println("Indexof = "+itr.nextIndex() +" value = "+itr.next());
		}
		
		System.out.println("Traversing elements in backword direction");  
		while(itr.hasPrevious()) {
			System.out.println("Indexof =" +itr.previousIndex() +" Value is = " +itr.previous());
			
		}
		

	}

}
