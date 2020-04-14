package t13Multithreading;

public class Lab_07_TestJoinMethod1 extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(50);
			}
				catch (Exception  e) {
					System.out.println(e);
				}
			System.out.println(i);
			}
			
		}
	public static void main(String arg[]) {
		Lab_07_TestJoinMethod1 t1=new Lab_07_TestJoinMethod1();
		Lab_07_TestJoinMethod1 t2=new Lab_07_TestJoinMethod1();
		Lab_07_TestJoinMethod1 t3=new Lab_07_TestJoinMethod1();
		t1.run();
		
		try {
			t1.join();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	t2.start();
	t3.start();
	}
	
	

}
