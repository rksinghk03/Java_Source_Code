package t10JavaMultithreading;


public class AThreadStartTwice extends Thread {
	public void run() {
		System.out.println("Hello twice a thread");
	}

	public static void main(String[] args) {
		AThreadStartTwice t1=new AThreadStartTwice();
		t1.start();
		t1.start();

	}

}
