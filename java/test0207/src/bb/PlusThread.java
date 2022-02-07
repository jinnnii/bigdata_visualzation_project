package bb;

public class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	public void run() {
		myData.plusData();
		System.out.println("실행결과: "+myData.data);
	}
}
