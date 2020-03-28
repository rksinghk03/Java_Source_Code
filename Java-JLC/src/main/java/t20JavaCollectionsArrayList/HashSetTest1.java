package t20JavaCollectionsArrayList;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
//HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. 
// Hashing is used to store the elements in the HashSet. It contains unique items
	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<String>();
		set1.add("Raj");
		set1.add("Kumar");
		set1.add("Amit");
		set1.add("pal");
		set1.add("pal");
		set1.add("Raj");
		Iterator <String> itr =set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
// 8422845515
// 8422845514