package bb;

public class PlusThreadTest {

	public static void main(String[] args) {
		MyData myData = new MyData();
		Thread th1 = new PlusThread(myData);
		th1.setName("plusThread1");
		th1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread th2 = new PlusThread(myData);
		th2.setName("plusThread2");
		th2.start();
	}

}
