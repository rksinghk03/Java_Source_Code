package t13Multithreading;

public class Lab_30_InterruptingThread  extends Thread{
	public void run() {
		for(int i=0;i<2;i++) {
			if(Thread.interrupted()) {
				System.out.println("code for interrupted thread");  
			}else {
				System.out.println("code for normal thread");  
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println("interrupted thread example");
		Lab_30_InterruptingThread t=new Lab_30_InterruptingThread();
		Lab_30_InterruptingThread t1=new Lab_30_InterruptingThread();
		t.start();
		t.interrupt();
		t1.start();
	}
}
