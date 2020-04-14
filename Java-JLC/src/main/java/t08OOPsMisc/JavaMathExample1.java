package t08OOPsMisc;

public class JavaMathExample1 {

	public static void main(String[] args) {
		double a=30;
		// converting values to radian    
        //double b = Math.toRadians(a);   
          double b=90;
        // return the trigonometric sine of a      
        System.out.println("Sine value of a is: " +Math.sin(a));   
        System.out.println("cos value of a is : " +Math.cos(a));
        // return the trigonometric tangent value of a  
        System.out.println("Tangent value of a is: " +Math.tan(a));  
        System.out.println("Max value of a is: " +Math.max(b, a));
	}

}
