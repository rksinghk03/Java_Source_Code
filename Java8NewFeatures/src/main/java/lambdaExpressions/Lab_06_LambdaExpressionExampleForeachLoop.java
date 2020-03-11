package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class Lab_06_LambdaExpressionExampleForeachLoop {

	public static void main(String[] args) {
		List <String> l1= new ArrayList<String>();
		l1.add("Raj");
		l1.add("Amit");
		l1.add("Kumar");
		l1.add("Singh");
		for (String string : l1) {
			System.out.println(string);
		}
		System.out.println("For each method");
		l1.forEach((n)-> System.out.println(n));

	}

}
