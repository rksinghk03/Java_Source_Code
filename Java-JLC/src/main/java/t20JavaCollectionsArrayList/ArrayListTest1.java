package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {
	public static void main(String args[]) {

	ArrayList <String> a1=new ArrayList<String>();
	a1.add("Amit");
	a1.add("Raj");
	a1.add("Shyam");
	Iterator itr = a1.iterator();
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
	
	}
System.out.println(a1);
}
}
	
