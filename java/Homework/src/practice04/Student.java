package practice04;

public class Student {
	private int sno;
	private String name;
	private String dept;
	private int[] scores;
	private double avg;
	private int rank=1;
	private int total;
	
	public Student(int sno, String name, String dept, int... scores) {
		super();
		this.sno = sno;
		this.name = name;
		this.dept = dept;
		this.scores = scores;
		this.scoresPro();
	}
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	

	private void scoresPro() {
		this.total = 0;
		for(int s:scores) {
			this.total+=s;
		}
		this.avg = (double)this.total/scores.length;
	}
	
	public void rankPro(Student[] arr) {
		for(Student s:arr) {
			if(s.avg>this.avg) {
				this.rank++;
			}
		}
	}
	
	public void display() {
		
		System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d",
				this.sno,this.name,this.dept,
				this.scores[0],this.scores[1],this.scores[2],
				this.total,this.avg,this.rank);
		System.out.println();
	}
	
}
