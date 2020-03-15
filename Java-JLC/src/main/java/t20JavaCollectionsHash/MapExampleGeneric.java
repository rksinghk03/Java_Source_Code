package t20JavaCollectionsHash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExampleGeneric {

	public static void main(String[] args) {
		Map<Integer, String> map1=new HashMap<Integer,String>();
		System.out.println("hello map how are you ");
		map1.put(101, "raj");
		map1.put(102, "kumar");
		map1.put(103, "singh");
		map1.put(104, "up");
		//map1.size();
		//System.out.println(map1);
		Set set1=map1.entrySet();
	Iterator <Set>itr =set1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
	

}
