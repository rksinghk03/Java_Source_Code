package t20JavaCollectionsSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		
		String s= "aabbce";
		char []c=s.toCharArray();
		String finalString="";
		String out="";
		StringBuffer sb = new StringBuffer(s);
		int k=0;
		int j=0;
		for (char d : c) {
		
			if(d=='o'|| d=='e'||d=='a'|| d=='i') {
			
				
				int n=(d)-96;
				
				for (int i = 0; i<n; i++) {
					finalString=finalString+"x";
					
				}
			out=	s.replaceAll(Character.toString(d), finalString);
			s=out;
			}
			
		}
		System.out.println(out);
		
	}
	

}
