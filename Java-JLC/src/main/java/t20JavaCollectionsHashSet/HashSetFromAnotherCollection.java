package t20JavaCollectionsHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetFromAnotherCollection {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("one");
		al.add("two");
		al.add("three");
		System.out.println(al);
		
		HashSet<String> hset=new HashSet<String>(al);
		hset.add("four");
		hset.add("five");
		System.out.println(hset);
		

	}

}
