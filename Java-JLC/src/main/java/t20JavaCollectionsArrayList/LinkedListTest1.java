package t20JavaCollectionsArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest1 {

public static void main(String args[]) {
	LinkedList <String> llist =new LinkedList <String>();
	
	llist.add("Rajkumar");
	llist.add("Aman");
	llist.add("Kamina");
	llist.add("Shyam");
	System.out.println("Linked list value is ");
	Iterator <String> itr = llist.iterator();
	while (itr.hasNext()) {
		
		System.out.println(itr.next());
		
	}
}
}
