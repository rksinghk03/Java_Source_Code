package concurrencyParallelism;

public class Test1 extends Thread implements Runnable
{
    public void run()
    {
        System.out.printf("running ");
    }
    public static void main(String[] args) throws InterruptedException
    {
        Test1 obj = new Test1();
        obj.run();
        obj.start();
        System.out.print(obj.getState());
    }
}