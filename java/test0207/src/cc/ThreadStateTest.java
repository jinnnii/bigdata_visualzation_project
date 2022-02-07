package cc;

import java.time.chrono.ThaiBuddhistEra;

public class ThreadStateTest {

	public static void main(String[] args) throws InterruptedException {
		Thread.State state;
		Thread th = new Thread() {
			public void run() {
				for (int i=0; i<10000000l; i++) {
					
				}
			}
		};
		state = th.getState();
		System.out.println("thread state: "+state);
		th.start();
		state = th.getState();
		System.out.println("thread state: "+state);
		th.join();
		state= th.getState();
		System.out.println("thread state: "+state);
	}

}
