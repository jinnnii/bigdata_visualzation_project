package aa;

public class ThreadTest01 {

	public static void main(String[] args) {
		Thread myThread = new MyThread();
		Thread videoThread = new VideoThread();
		
		myThread.start();
		videoThread.start();
	}
	

}
