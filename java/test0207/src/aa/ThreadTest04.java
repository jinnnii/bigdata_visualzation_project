package aa;

public class ThreadTest04 {

	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println("현재 스레드 이름 : "+curThread);
		System.out.println("쓰레드 수 : "+Thread.activeCount());
		
		for (int i=0; i<5; i++) {
			Thread th = new Thread();
			th.setName(i+"번째 스레드");
			System.out.print(th.getName()+" | ");
			System.out.print(th.getId()+" | ");//스레드 아이디
			System.out.println(th.getPriority()); //우선순위
			th.start();
		}
	}

}
