package t13Multithreading;

public class Lab_16_Garbage {
	public void finalize () {
		System.out.println("Garbage collected ");
		
	}
	
	public static void main(String args []) {
		Lab_16_Garbage n =new Lab_16_Garbage();
		Lab_16_Garbage n1=new Lab_16_Garbage();
		n.finalize();
		n1.finalize();
		System.gc();
	}

}
