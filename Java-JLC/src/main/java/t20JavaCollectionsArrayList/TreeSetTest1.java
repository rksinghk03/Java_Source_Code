package t20JavaCollectionsArrayList;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {
	//Java TreeSet class implements the Set interface that uses a tree for storage. Like HashSet, 
	//TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.

	public static void main(String[] args) {
		
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("raj");
		tset.add("singh");
		tset.add("pal");
		tset.add("amit");
		tset.add("amit");
		Iterator<String> itr=tset.iterator();
		
while(itr.hasNext()) {
	System.out.println(itr.next());
	
}
	}

}
