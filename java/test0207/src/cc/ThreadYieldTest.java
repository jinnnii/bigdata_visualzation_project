package cc;

public class ThreadYieldTest {

	public static void main(String[] args) throws InterruptedException {
		MyThread th1 = new MyThread();
		th1.setName("th1");
		th1.yieldFlag = false;
		th1.setDaemon(true);
		th1.start();
		
		MyThread th2 = new MyThread();
		th2.setName("th2");
		th2.yieldFlag = true;
		th2.setDaemon(true);
		th2.start();
		
		for(int i=0; i<6; i++) {
			Thread.sleep(1000);
			th1.yieldFlag=!th1.yieldFlag;
			th2.yieldFlag=!th2.yieldFlag;
		}
	}

}
