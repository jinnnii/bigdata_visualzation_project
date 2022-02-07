package dd;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		
		Thread.sleep(100);
		System.out.println("MyThread state:"+myThread.getState());
		
		myThread.interrupt();
		Thread.sleep(100);
		System.out.println("MyThread state:"+myThread.getState());
	}

}
