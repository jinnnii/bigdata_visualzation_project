package aa;

public class VideoThread extends Thread{
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
}
