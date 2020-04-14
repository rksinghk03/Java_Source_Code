package t13Multithreading;

public class Lab_06_RunMethod extends Thread {
	public void run() {
		System.out.println("Thread  is running ");
		
		for(int i=0; i<=10;i++) {
			try { 
				Thread.sleep(500);
			}
		catch (InterruptedException e){
			System.out.println(e);
			}
		System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_06_RunMethod n=new Lab_06_RunMethod();
		Lab_06_RunMethod n1=new Lab_06_RunMethod();
		n.run();
		n1.run();

	}

}
