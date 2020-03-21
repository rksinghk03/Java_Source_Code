package t20JavaCollectionsArrayList;

import java.util.ArrayList;

public class ArrayListExampleAddElements {

	public static void main(String[] args) {
	ArrayList<String> al1=new ArrayList<String>();
	al1.add("raj");
	al1.add("kumar");
	al1.add("singh");
	System.out.println(al1);
	
	//Adding an element at the specific position  
    al1.add(2, "Amit");  
    System.out.println(al1);
    ArrayList<String> al2=new ArrayList<>();
    al2.add("ArrayList21");
    al2.add("ArrayList22");
    al2.add("ArrayList23");
    al2.add("ArrayList24");
    System.out.println(al2);
    al2.addAll(al1);
    System.out.println(al2);
    al2.remove(0);
    al2.remove(1);
    System.out.println(al2);
    al2.add(2, "rajkumar");
    System.out.println(al2);
  //Removing elements on the basis of specified condition  
    al2.removeIf(str -> str.contains("ArrayList23"));   //Here, we are using Lambda expression   
    System.out.println("after removig the element if ArrayList23 ="+al2);
	}

}
