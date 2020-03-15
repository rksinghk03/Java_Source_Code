package t20JavaCollectionsArrayList;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest1 {
	//LinkedHashSet class represents the LinkedList implementation of Set Interface. It extends the HashSet class and implements Set interface.
	//Like HashSet, It also contains unique elements. It maintains the insertion order and permits null elements.

	public static void main(String[] args) {
		LinkedHashSet<String> lset1=new LinkedHashSet<String>();
		
		lset1.add("Raj");
		lset1.add("Pal");
		lset1.add("Pal");
		lset1.add("Raj");
		Iterator<String> itr = lset1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
