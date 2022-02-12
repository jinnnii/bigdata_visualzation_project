package practice07;

public class Word {
	private String en;
	private String kr;
	
	public Word(String en, String kr) {
		super();
		this.kr = kr;
		this.en = en;
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public String getKr() {
		return kr;
	}

	public void setKr(String kr) {
		this.kr = kr;
	}

	@Override
	public String toString() {
		return en + "," + kr;
	}	
}
