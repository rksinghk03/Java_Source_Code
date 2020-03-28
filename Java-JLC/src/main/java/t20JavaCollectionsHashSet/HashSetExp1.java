package t20JavaCollectionsHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExp1 {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add("raj");
		hset.add("kumar");
		hset.add("singh");
		hset.add("up");
		 hset.add("One");    
		 hset.add("Two");    
		 hset.add("Three");   
		 hset.add("Four");  
		 hset.add("Five");  
		System.out.println(hset);
		Iterator<String> itr=hset.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		}
	}

}
