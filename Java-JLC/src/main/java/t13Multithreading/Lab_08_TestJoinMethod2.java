package t13Multithreading;

public class Lab_08_TestJoinMethod2  extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		Lab_08_TestJoinMethod2 t1= new Lab_08_TestJoinMethod2();
		Lab_08_TestJoinMethod2 t2=new Lab_08_TestJoinMethod2();
		Lab_08_TestJoinMethod2 t3=new Lab_08_TestJoinMethod2();
		t1.start();
		try {
			t1.join();
		}catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}
