package practice06;

public class MelonTest {

	public static void main(String[] args) {
		Melon mel = new Melon();
		mel.setCal(50);
		mel.setCost(300000);
		mel.setKg(1);
		mel.setInfo("기타 경작 농원");
		
		mel.display();
	}

}
