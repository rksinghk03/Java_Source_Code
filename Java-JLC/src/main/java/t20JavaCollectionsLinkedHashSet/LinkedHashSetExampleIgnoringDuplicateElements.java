package t20JavaCollectionsLinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExampleIgnoringDuplicateElements {

	public static void main(String[] args) {
		LinkedHashSet<String> lhset=new LinkedHashSet<String>();
		lhset.add("one");
		lhset.add("two");
		lhset.add("three");
		lhset.add("four");
		lhset.add("five");
		lhset.add("three");
		lhset.add("four");
		lhset.add("five");
		System.out.println(lhset);
		Iterator<String> itr =lhset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
