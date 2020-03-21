package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2Iterator {

	public static void main(String[] args) {
		ArrayList <String> al1=new ArrayList<String>();
		al1.add("amit");
		al1.add("pal");
		al1.add("raj");
		al1.add("singh");
		Iterator <String> itr= al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(al1);
	}

}
