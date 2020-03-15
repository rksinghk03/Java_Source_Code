package t20JavaCollectionsLinkedList;

import java.util.LinkedList;

public class LinkedListRemoveElements {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");

		System.out.println("Linked list = "+ll +"size = "+ll.size());
		ll.removeFirst();
		ll.add("four");
		ll.add("five");
		ll.add("one");
		ll.add("two");
		ll.add("three");
		//ll.removeLast();
		System.out.println("update Linked list = "+ll +"size = "+ll.size());
		ll.removeFirstOccurrence("two");
		System.out.println("after removeFirstOccurrence = "+ll +"size = "+ll.size());
		ll.removeLastOccurrence("three");
		System.out.println("after removeFirstOccurrence = "+ll +"size = "+ll.size());
	}

}
