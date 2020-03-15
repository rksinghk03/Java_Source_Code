package t20JavaCollectionsSet;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> shapes =new ArrayList<>();
		shapes.add(10000);
		shapes.add(20000);
		shapes.add(30000);
		shapes.add(40000);
		shapes.add(35000);
		
		shapes.stream().filter(x->x>30000)
		

	}
}
