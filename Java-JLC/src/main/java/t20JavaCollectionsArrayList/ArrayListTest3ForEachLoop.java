package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest3ForEachLoop {
	public static void main(String args[]) {

	ArrayList<String> al1=new ArrayList<String>();
	al1.add("For");
	al1.add("Each");
	al1.add("Loop");
	al1.add("use");
	Iterator <String> itr= al1.iterator();
	for(String obj:al1) {
		System.out.println(obj);
	}
	System.out.println(al1);
}
}