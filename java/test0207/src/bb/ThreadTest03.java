package bb;

public class ThreadTest03 {

	public static void main(String[] args) {
		MyData3 myData = new MyData3();
		new Thread() {
			public void run() {
				myData.abc();
			}
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			}
		}.start();
	}

}
