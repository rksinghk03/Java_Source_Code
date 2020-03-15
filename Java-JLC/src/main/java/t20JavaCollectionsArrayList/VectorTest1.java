package t20JavaCollectionsArrayList;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest1 {
	public static void main(String args[]) {
	Vector <String> v1=new Vector<String> ();
	v1.add("Amit Vector");
	v1.add("Pal Vector");
	v1.add("Prashant vector");
	v1.add("Suman vector");
	System.out.println("Vector value are below");
	Iterator itr =v1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
	}

}
