package t10JavaMultithreading;

public class MultiSleepMethod extends Thread {
	
public void run() {
	
	for(int i=0;i<=20;i++) {
		try {
			Thread.sleep(500);
		}
	    
			catch(InterruptedException e) {
					System.out.println(e);
				}
	System.out.println(i);
	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiSleepMethod t1=new MultiSleepMethod();
		MultiSleepMethod t2=new MultiSleepMethod();
		MultiSleepMethod t3=new MultiSleepMethod();
		MultiSleepMethod t4=new MultiSleepMethod();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
