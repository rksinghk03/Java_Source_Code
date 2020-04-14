package t13Multithreading;

public class Lab_12_DaemonThread1 extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			
		System.out.println("Demon thread");
		
		}
		else {
			System.out.println("Normal thread");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_12_DaemonThread1 t=new Lab_12_DaemonThread1();
		Lab_12_DaemonThread1 t1=new Lab_12_DaemonThread1();
		t.setDaemon(true);
		t.start();
		t1.start();
		//t.setDaemon(true); //will throw exception here  
		
	}

}
