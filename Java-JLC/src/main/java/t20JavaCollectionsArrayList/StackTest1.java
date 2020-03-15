package t20JavaCollectionsArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackTest1 {
	
	public static void main(String args[]) {
		System.out.println("Hello Stack how are you ");
		List <String> stack1=new Stack<String>();
		stack1.add("Amit");
		stack1.add("Raj");
		stack1.add("Prashant");
		stack1.add("Amit");
		((Stack<String>) stack1).push("Rubby");
		((Stack<String>) stack1).push("ram");
		((Stack<String>) stack1).pop();
	Iterator<String> itr =stack1.iterator();
		
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		
	}

}
