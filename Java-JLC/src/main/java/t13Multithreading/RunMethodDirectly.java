package t13Multithreading;

public class RunMethodDirectly extends Thread {
public void run() {
	for(int i=0;i<=10;i++) {
		try {
			Thread.sleep(400);
			}
		catch(Exception e) {
							 System.out.println(e);
							}
	     
	System.out.println(i);
}
}
	public static void main(String[] args) {
		RunMethodDirectly t1= new RunMethodDirectly();
		RunMethodDirectly t2= new RunMethodDirectly();
		t1.run();
		t2.run();
/*		t1.start();
		t2.start();*/

	}

}
