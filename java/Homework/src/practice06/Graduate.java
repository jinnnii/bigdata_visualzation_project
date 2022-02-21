package practice06;

public class Graduate extends Student{
	public Graduate(String name, int sno, String dept, int grade, double credit, String assiType, double scholarship) {
		super(name, sno, dept, grade, credit);
		this.setAssiType(assiType);
		this.setScholarship(scholarship);
	}

	private String assiType;
	private double scholarship;
	
	public String getAssiType() {
		return assiType;
	}
	public void setAssiType(String assiType) {
		if(assiType.equals("교육 조교")
			|| assiType.equals("연구 조교")){
				this.assiType = assiType;
			}
		else {
			System.out.println("조교 유형이 잘못되었습니다,");
			return;
		}
	}
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		if(scholarship<0 || scholarship>1) {
			System.out.println("장학금 비율 입력이 잘못되었습니다.");
			return;
		}
		this.scholarship = scholarship;
	}
	
	public void display() {
		super.display();
		System.out.printf("조교 유형 : %s / 장학금 여부 : %s",
				this.assiType,
				this.scholarship>0 ?"받음":"못받음");
		System.out.println();
	}
	
}
