package t10JavaMultithreading;

public class Multi extends Thread {
	public void run() {
		System.out.println("run method is calling");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Multi t1= new Multi();
		//t1.run();
		t1.start(); // we need to extend the Thread class after that we can use thread class method.
		t1.sleep(20000);
	}

}
