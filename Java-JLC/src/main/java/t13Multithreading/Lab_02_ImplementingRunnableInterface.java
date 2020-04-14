package t13Multithreading;

public class Lab_02_ImplementingRunnableInterface implements Runnable {

	 public void run() {
		 System.out.println(" using implementing Runnable interface run method is running");
		 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_02_ImplementingRunnableInterface m =new Lab_02_ImplementingRunnableInterface();
		Thread t1 = new Thread(m);
		t1.start();
		

	}

}
