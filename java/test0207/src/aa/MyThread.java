package aa;

public class MyThread extends Thread{
	public void run() {
		String[] strArray = new String[] {"하나","둘","셋","넷","다섯"};
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//0.1초동안 멈춤
		for(int i=0; i<strArray.length;i++) {
			System.out.println("(자막) "+strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
