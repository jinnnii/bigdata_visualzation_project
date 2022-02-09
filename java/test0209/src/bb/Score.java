package bb;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private int meth;
	public Score(String name, int kor, int eng, int meth) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.meth = meth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMeth() {
		return meth;
	}
	public void setMeth(int meth) {
		this.meth = meth;
	}
	@Override
	public String toString() {
		return  name + ", " + kor + ", " + eng + ", " + meth;
	}
	
	
}
