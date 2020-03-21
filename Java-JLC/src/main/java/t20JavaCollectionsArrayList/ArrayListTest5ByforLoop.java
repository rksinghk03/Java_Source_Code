package t20JavaCollectionsArrayList;

import java.util.ArrayList;

public class ArrayListTest5ByforLoop {
	static int index=0;
	public static void main(String[] args) {
	ArrayList<String> al1=new ArrayList<String>();
		System.out.println("ArrayListTest_ByforLoop");
		al1.add("Raj");
		al1.add("Kumar");
		al1.add("Singh");
		al1.add("UP");
		  System.out.println("Traversing list through for loop:");  
		  for(int i=0;i>=al1.size();i++) {
			  
			  System.out.println(al1.get(i));
			  System.out.println(al1.get(index));
			  index++;
		  }
		System.out.println(al1);
	System.out.println(index);

	}

}
