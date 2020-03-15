package t20JavaCollectionsTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTraversingElementsInDescendingOrder {

	public static void main(String[] args) {
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("raj");
		tset.add("kumar");
		tset.add("singh");
		tset.add("up");
		System.out.println("Tree Set Descending order");
		Iterator<String> itr=tset.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
		
		

	}

}
