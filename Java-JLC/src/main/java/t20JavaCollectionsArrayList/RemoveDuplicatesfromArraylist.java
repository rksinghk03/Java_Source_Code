package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList <Integer> intal =new ArrayList<Integer>();

      intal.add(10);
      intal.add(20);
      intal.add(50);
      intal.add(30);
      intal.add(10);
      intal.add(20);
      System.out.println("Orginal Array List is = "+intal);
      
      for (int i=0;i<=intal.size();i++) {
    	  for(int j=i+1; j<=intal.size();j++) {
    		  if(intal.get(i).equals(intal.get(j))) {
    			  System.out.println(intal);
    			  	intal.remove(j);
    			  	j--;
    		  }
    	  }	 
    	  System.out.println("tails= "+intal);
      }
      
      /*Set<Integer> set=new HashSet<Integer>(intal);
      System.out.println("Remove dublicate value="+set);*/
      
	}

}
