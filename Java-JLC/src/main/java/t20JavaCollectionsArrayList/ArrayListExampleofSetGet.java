package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExampleofSetGet {

	public static void main(String[] args) {
	ArrayList al=new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	System.out.println(al);
	System.out.println("before updating the arrayList="+al.get(1));
	al.set(1, 5);
	System.out.println("after updating the value="+al);

	}

}
