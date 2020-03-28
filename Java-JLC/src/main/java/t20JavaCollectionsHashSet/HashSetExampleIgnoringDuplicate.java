package t20JavaCollectionsHashSet;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetExampleIgnoringDuplicate {

	public static void main(String[] args) {
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(1);
		hset.add(2);
		hset.add(3);
		hset.add(4);
		hset.add(12);
		hset.add(12);
		hset.add(13);
		hset.add(13);
		System.out.println(hset);
		Iterator<Integer> itr= hset.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}

	}

}
