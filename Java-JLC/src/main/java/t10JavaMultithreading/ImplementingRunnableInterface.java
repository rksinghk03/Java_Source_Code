package t10JavaMultithreading;

public class ImplementingRunnableInterface implements Runnable {

	 public void run() {
		 System.out.println(" using implementing Runnable interface run method is running");
		 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingRunnableInterface m =new ImplementingRunnableInterface();
		Thread t1 = new Thread(m);
		t1.start();
		

	}

}