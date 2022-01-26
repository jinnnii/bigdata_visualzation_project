package test0126;

public class Student {
	int sno;
	String major;
	String name;
	String gender;
	
	Student(){}
	
	public Student(int sno, String major, String name, String gender) {
		super();
		this.sno = sno;
		this.major = major;
		this.name = name;
		this.gender = gender;
	}

	public void display() {
		System.out.println("sno:"+sno);
		System.out.println("major:"+major);
		System.out.println("name:"+name);
		System.out.println("gender:"+gender);
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getSno() {
		return sno;
	}	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sno=3;
		s1.major="멀티미디어";
		s1.name="홍길동";
		s1.gender="남자";
		
		Student s2 = new Student(1,"컴공","홍길동","남자");
		
		Student s3 = new Student();
		s3.setSno(20);
		s3.setMajor("기계");
		s3.setName("홍련");
		s3.setGender("여자");
		System.out.println(s3.getName());
		System.out.println("------------------------");
		
		s1.display();
		System.out.println();
		s2.display();
	}
}
