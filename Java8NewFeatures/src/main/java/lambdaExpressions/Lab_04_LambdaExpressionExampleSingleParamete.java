package lambdaExpressions;
interface Syaable{
	public String say(String name);
	
}
public class Lab_04_LambdaExpressionExampleSingleParamete {

	public static void main(String[] args) {
		Syaable s1=(name)->{
			return "Hello " + name;
		};

		System.out.println(s1.say("raj"));
	
	Syaable s2=(name)->{
		return "Hello "+name;
	};
	
	System.out.println(s2.say("kumar"));
	}
}
