package t20JavaCollectionsLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List ll=new LinkedList<String>();
		ll.add("raj");
		ll.add("kumar");
		ll.add("singh");
		System.out.println(ll);
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
