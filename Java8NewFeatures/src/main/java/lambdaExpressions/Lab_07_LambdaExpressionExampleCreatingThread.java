package lambdaExpressions;

public class Lab_07_LambdaExpressionExampleCreatingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r  = new Runnable() {

			@Override
			public void run() { System.out.println("Thread1 is running");
			}
		};
			Thread t1 =new Thread(r);
			t1.start();
		
	Runnable r1= ()->{
		System.out.println("Thread2 is running");
	};
	 Thread t2=new Thread(r1);
	 t2.start();
	}
}
