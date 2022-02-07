package aa;

public class ThreadTest03 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
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
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				int[] intArray = new int[] {1,2,3,4,5};
				for(int i=0; i<intArray.length; i++) {
					System.out.println("(비디오 프레임) "+intArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
//		myThread2.start();
	}

}
