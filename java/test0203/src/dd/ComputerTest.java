package dd;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c = new Computer() {
			public void typing() {}
		};
		Computer d1 = new DeskTop();
		Computer d2 = new DeskTop(512,"i5",16,"DeskTop",25);
		d2.display();
		d2.typing();
	}

}
