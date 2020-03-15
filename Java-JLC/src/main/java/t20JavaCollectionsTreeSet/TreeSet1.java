package t20JavaCollectionsTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("raj");
		tset.add("kumar");
		tset.add("singh");
		tset.add("raj");
		System.out.println("TreeSet example");
		Iterator <String> itr=tset.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		}
		
		

	}

}
