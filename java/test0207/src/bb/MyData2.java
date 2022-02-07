package bb;

public class MyData2 {
	int data = 3;

	public void plusData() {
		synchronized (this) {
			int myData = data;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			data = myData + 1;
		}
	}
}
