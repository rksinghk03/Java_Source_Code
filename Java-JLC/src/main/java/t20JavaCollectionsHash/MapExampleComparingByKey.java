package t20JavaCollectionsHash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExampleComparingByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(101,"raj");
		map1.put(101,"kumar");
		map1.put(101,"singh");
		map1.put(101,"UPMAP");
		//map1.entrySet();
	
		//Returns a Set view of the mappings contained in this map        
	      map1.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	 }  
		

}
