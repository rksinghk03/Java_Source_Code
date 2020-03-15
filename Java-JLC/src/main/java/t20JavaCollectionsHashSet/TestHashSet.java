package t20JavaCollectionsHashSet;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet<String>();
		
		set1.add("rajkumar");
		set1.add("rajkumar");
		System.out.println("List of st value = "+set1);
		for (String s: set1) {
			System.out.println(s.toUpperCase()+"");
			
		}

	}

}
