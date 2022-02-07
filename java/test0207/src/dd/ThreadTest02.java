package dd;

public class ThreadTest02 {

	public static void main(String[] args) {
		DataBox db = new DataBox();
		Thread th1 = new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					try {
					db.inputData(i);
					}catch(InterruptedException e) {}
				}
			}
		};
		
		
		Thread th2 = new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					try {
					db.outputData();
					}catch(InterruptedException e) {}
				}
			}
		};
		
		th1.start();
		th2.start();

	}

}
