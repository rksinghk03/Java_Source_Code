package t04Polymorphism;

public class Lab_12_FinalVariable {

	final int speedLimit=90;
	void run() {
		
		System.out.println("speed = "+speedLimit);
		speedLimit=400;
		System.out.println("speed = "+speedLimit);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_12_FinalVariable n=new Lab_12_FinalVariable();
		n.run();
	}

}
