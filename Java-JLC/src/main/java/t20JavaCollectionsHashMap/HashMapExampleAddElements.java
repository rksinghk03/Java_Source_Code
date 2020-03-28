package t20JavaCollectionsHashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapExampleAddElements {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,String> map1=new Hashtable<Integer, String>();
		 
		    map1.put(101,"raj");
			map1.put(101,"kumar");
			map1.put(101,"singh");
			map1.put(101,"UPMAP");
			//System.out.println(map1);
			Set set1=map1.entrySet();
			Iterator <Set>itr =set1.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			}

}
