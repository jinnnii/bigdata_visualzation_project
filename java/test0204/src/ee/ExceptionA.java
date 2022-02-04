package ee;

public class ExceptionA {
	void abc() {
		bcd();
	}
	void bcd(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//0.1초간 sleep
	}
}	

class ExceptionB{
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	void bcd() throws InterruptedException {
		Thread.sleep(100);
	}
}