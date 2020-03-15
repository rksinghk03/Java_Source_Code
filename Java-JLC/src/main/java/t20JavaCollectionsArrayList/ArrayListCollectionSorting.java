package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al1=new ArrayList();
		al1.add(10);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(60);
		al1.add(50);
		al1.add(40);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		Collections.reverse(al1);
		System.out.println("Reverse list ="+al1);
		
		ArrayList<String> al2=new ArrayList();
		al2.add("Rajkumar");
		al2.add("Amit");
		al2.add("Prashant");
		al2.add("Aman");
		al2.add("Singh");
		System.out.println(al2);
		 Collections.sort(al2);
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println("reverse of al2= "+al2);
		
		

	}

}
