package t20JavaCollectionsTreeSet;

import java.util.TreeSet;

public class TreeSetretrieveRemoveHighestLowestValue {

	public static void main(String[] args) {
		TreeSet<Integer> tset=new TreeSet<Integer>();
		
	    tset.add(12);
	    tset.add(52);
	    tset.add(35);
	    tset.add(54);
	    tset.add(51);
	    System.out.println(tset);
	    System.out.println("Lowest Value: "+tset.pollFirst());
	    System.out.println("Highest Value: "+tset.pollLast());
	    System.out.println(tset);
	
	}

}
