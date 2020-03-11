package lambdaExpressions;
interface Sayable{
	public String say();
}
public class Lab_03_LambdaExpressionExampleNoParameter {
	
	public static void main(String[] args) {  
	    Sayable s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}

}
