package dd;

public class MyThread extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("--sleep() 중 intterrupt 발생--");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {}
		}
	}
}
