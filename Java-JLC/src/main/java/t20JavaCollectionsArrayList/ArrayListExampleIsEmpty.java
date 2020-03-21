package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExampleIsEmpty {

	public static void main(String[] args) {
		Collection al=new ArrayList<String>();
		Collection al1=new ArrayList<Integer>();
		al.isEmpty();
		if(al.isEmpty()) {
			System.out.println("ArrayList is empty");
			al.add("raj");
			al.add("kumar");
			al.add("singh");
		}
		System.out.println(al);
		
if(al1.isEmpty()) {
	al1.add(1);
	al1.add(2);
	al1.add(3);
	System.out.println(al1);
}
	}

}
