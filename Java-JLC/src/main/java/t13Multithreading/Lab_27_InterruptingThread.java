package t13Multithreading;

public class Lab_27_InterruptingThread extends Thread {
	public void run(){  
		try{  
		Thread.sleep(1000);  
		System.out.println("task");  
		}
		catch(InterruptedException e){  
			throw new RuntimeException("Thread interrupted..."+e);  
			}  
		  
		}  
		  
		public static void main(String args[]){  
			Lab_27_InterruptingThread t1=new Lab_27_InterruptingThread();  
		t1.start();  
		try{  
		t1.interrupt();  
		}catch(Exception e){System.out.println("Exception handled "+e);}  
		  
		}  

}
