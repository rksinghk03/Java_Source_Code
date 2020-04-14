package t10JavaMultithreading;

public class Lab_10_CurrentThread extends Thread{
	
	public void run() {
		System.out.println("hello run thread");
		System.out.println(Thread.currentThread().getName());
	}
public void show() {
	System.out.println("hello current thread ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_10_CurrentThread t1=new Lab_10_CurrentThread();
		Lab_10_CurrentThread t2=new Lab_10_CurrentThread();
		t1.start();
		t2.start();
		//t1.show();
	}

}
