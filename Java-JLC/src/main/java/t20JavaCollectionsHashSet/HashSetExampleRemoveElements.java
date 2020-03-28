package t20JavaCollectionsHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExampleRemoveElements {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add("raj");
		hset.add("kumar");
		hset.add("singh");
		hset.add("up");
		hset.add("bangalore");
		 System.out.println("An initial list of elements: "+hset);  
         //Removing specific element from HashSet  
         hset.remove("raj");  
         System.out.println("After removing an element list of elements: "+hset); 
         //Removing all the new elements from HashSet  
         //hset.removeAll(hset);  
         System.out.println("Updated list of elements: "+hset); 
         //Removing elements on the basis of specified condition  
         hset.removeIf(str->str.contains("singh"));    
         System.out.println("After invoking removeIf() method: "+hset);  
         //Removing all the elements available in the set  
         hset.clear();  
         System.out.println("After invoking clear() method: "+hset);  
         
		Iterator<String>itr=hset.iterator();
		
	}

}
