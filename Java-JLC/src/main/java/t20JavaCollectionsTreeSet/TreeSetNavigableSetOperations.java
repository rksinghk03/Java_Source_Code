package t20JavaCollectionsTreeSet;

import java.util.TreeSet;

public class TreeSetNavigableSetOperations {

	public static void main(String[] args) {
		TreeSet<String> tset =new TreeSet<String>();
		tset.add("A");
		tset.add("B");
		tset.add("C");
		tset.add("D");
		tset.add("E");
		System.out.println("Initial Set: "+tset); 
		System.out.println("Sub Set: "+tset.subSet("A", "E")); 
		

	}

}
