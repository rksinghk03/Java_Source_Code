package t13Multithreading;

public class Lab_28_InterruptingThreadWillWork extends Thread {
	public void run(){  
		try{  
		Thread.sleep(1000);  
		System.out.println("task");  
		}catch(InterruptedException e){  
		System.out.println("Exception handled "+e);  
		}  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			Lab_28_InterruptingThreadWillWork t1=new Lab_28_InterruptingThreadWillWork();  
		t1.start();  
		  
		t1.interrupt();  
		}
}
