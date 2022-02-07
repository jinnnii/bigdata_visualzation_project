package bb;

public class ThreadTest02 {

	public static void main(String[] args) {
		Thread th1= new MyThread02();
//		th1.setDaemon(false);
		th1.setDaemon(true);
		th1.setName("thead1");
		th1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread 종료");
	}

}
