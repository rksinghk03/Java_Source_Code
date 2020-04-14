package t13Multithreading;

public class Lab_04_StartThreadTwice extends Thread {
	public void run() {
		System.out.println("thread is runnning ");
	}
	public static void main(String args[]) {
	Lab_04_StartThreadTwice n=new Lab_04_StartThreadTwice();
	n.start();
	n.start();
	//n.run();
}
}
