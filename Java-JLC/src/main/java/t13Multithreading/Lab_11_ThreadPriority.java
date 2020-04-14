package t13Multithreading;

public class Lab_11_ThreadPriority extends Thread{

	public void run() {
		//System.out.println("Hello run method");
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_11_ThreadPriority n=new Lab_11_ThreadPriority();
		Lab_11_ThreadPriority n1=new Lab_11_ThreadPriority();
		Lab_11_ThreadPriority n2=new Lab_11_ThreadPriority();
		Lab_11_ThreadPriority n3=new Lab_11_ThreadPriority();
		n.start();
		n1.start();
		n2.start();
		n3.start();
		n.setPriority(NORM_PRIORITY);
		n1.setPriority(MAX_PRIORITY);
		n2.setPriority(MIN_PRIORITY);
		
	}

}
