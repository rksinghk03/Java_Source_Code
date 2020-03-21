package t20JavaCollectionsArrayList;

import java.util.ArrayList;

public class ArrayListTest6ByforEachMethod {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		
		al1.add("Amit");
		al1.add("Kumar");
		al1.add("Pal");
		al1.add("UP");
		System.out.println("Traversing list through forEach() method:");  
        //The forEach() method is a new feature, introduced in Java 8.  
            al1.forEach(a->{ //Here, we are using lambda expression  
                System.out.println(a);  
              });  
		System.out.println(al1);

	}

}
