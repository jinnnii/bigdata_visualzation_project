package dd;

public class DataBox {
	int data;
	synchronized void inputData(int data) throws InterruptedException{
		this.data= data;
		System.out.println("입력데이터 :"+data);
	}
	synchronized void outputData() throws InterruptedException{
		System.out.println("출력데이터 :"+data);
	}
}
