package concurrencyParallelism;

import java.util.StringJoiner;

public class String1 {
	public static void main(String args[]) {
	StringJoiner astring = new StringJoiner("-", "{", "}");

	astring.add("A");
	astring.add("B");
	astring.add("C");
	System.out.println(astring);
}
}
