package t20JavaCollectionsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		System.out.println("Array list="+al);
		
		List<String> ll=new LinkedList<String>();
		ll.add("Linklist1");
		ll.add("Linklist3");
		ll.add("Linklist3");
	System.out.println("Linked List ="+ll);
		

	}

}
