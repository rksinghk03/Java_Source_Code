package lambdaExpressions;
interface Addable{
	int add(int a , int b);
}


public class Lab_05_LambdaExpressionExampleMultipleParameters {

	public static void main(String[] args) {
		
		// Multiple parameters in lambda expression  
		Addable a1=(a,b)-> (a+b);
		System.out.println("Add of two number = "+a1.add(10, 20));
		// Multiple parameters with data type in lambda expression  
		Addable a2=(int a, int b)-> (a+b);
		System.out.println("Add of two number = "+a1.add(40, 50));
		// Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println("Add of two number =" +ad2.add(100,200));  

	}

}
