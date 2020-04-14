package t13Multithreading;

public class Lab_29_InterruptingThread extends Thread {
	public void run() {
		System.out.println("Hello run method ");
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String args[]) throws InterruptedException {
		Lab_29_InterruptingThread t=new Lab_29_InterruptingThread();
		System.out.println("hi");
		t.start();
		t.interrupt();
		t.sleep(10);
	}

}
