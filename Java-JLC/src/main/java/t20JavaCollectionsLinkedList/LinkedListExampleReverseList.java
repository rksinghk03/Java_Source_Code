package t20JavaCollectionsLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExampleReverseList {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		System.out.println("List of elemet of = "+ll);
		Iterator itr =ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
