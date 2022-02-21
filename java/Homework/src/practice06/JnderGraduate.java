package practice06;

public class JnderGraduate extends Student{
	
	public JnderGraduate(String name, int sno, String dept, int grade, double credit, String clup) {
		super(name, sno, dept, grade, credit);
		this.clup = clup;
	}

	private String clup;
	
	public String getClup() {
		return clup;
	}

	public void setClup(String clup) {
		this.clup = clup;
	}
	
	public void display() {
		super.display();
		System.out.printf("소속 동아리 : %s",this.clup);
		System.out.println();
	}
}
