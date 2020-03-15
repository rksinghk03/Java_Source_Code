package t20JavaCollectionsLinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExampleAddElements {

	public static void main(String[] args) {
		LinkedList <String>ll=new LinkedList<String>();
		ll.add("raj");
		ll.add("kumar");
		ll.add("singh");
		System.out.println("List of all value of Linked List= "+ll);
		System.out.println("Adding element in the list at frist and last");
		ll.addFirst("Mr");
		ll.addLast("Amit Pal");
		System.out.println("List of all value after update Linked List= "+ll);

	}

}
