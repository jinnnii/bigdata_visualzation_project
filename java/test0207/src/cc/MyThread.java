package cc;

public class MyThread extends Thread{
	boolean yieldFlag;
	
	public void run() {
		while(true) {
			if(yieldFlag) {
				Thread.yield();//대기
			}else {
				System.out.println(getName()+"실행");
//				for(int i=0; i<1000000l ; i++) {}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
