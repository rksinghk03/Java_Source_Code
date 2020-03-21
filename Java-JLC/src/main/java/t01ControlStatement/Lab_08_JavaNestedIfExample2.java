package t01ControlStatement;

public class Lab_08_JavaNestedIfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=18, w=50;
		System.out.println("age ="+n + " weight ="+w);
		if(n>=18) {
			if(w==50) {
				System.out.println("Eligible for vote");
			
			}
			else {
			System.out.println("Not Eligible for vote");	
			}
			
			}
		else {
			System.out.println("you muct be grater that 18");
		}
		

	}

}
