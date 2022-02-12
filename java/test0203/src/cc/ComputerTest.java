package cc;

public class ComputerTest {

	public static void main(String[] args) {
		Computer d = new Desktop();
		d.display("Desktop");
		d.typing(512, 5, 16);
		
		Computer n = new Desktop();
		n.display("Notbook");
		n.typing(256, 7, 16);

	}

}
