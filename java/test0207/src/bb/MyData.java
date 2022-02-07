package bb;

public class MyData {
	int data =3;
	public synchronized void plusData() {
		int myData = data;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		data = myData+1;
	}
}
