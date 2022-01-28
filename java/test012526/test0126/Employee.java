package test0126;

public class Employee {
	private int empno;
	private String ename;
	private String dname;
	private String position;
	private int sal;
	
	public Employee() {};
	
	public Employee(int empno, String ename, String dname) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.dname = dname;
	}

	public Employee(int empno, String ename, String dname, String position, int sal) {
//		super();
		this(empno,ename,dname);
		this.position = position;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public void display() {
		System.out.printf("%d %s %s %s %d",empno,ename,dname,position,sal);
		System.out.println();
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpno(1);
		emp1.setEname("홍길동");
		emp1.setDname("영업부");
		emp1.setPosition("과장");
		emp1.setSal(500);
		emp1.display();
		
		Employee emp2 = new Employee(2,"홍길수","총무부");
		emp2.setPosition("대리");
		emp2.setSal(400);
		emp2.display();
		
		Employee emp3 = new Employee(3,"홍길미","홍보부","사원",300);
		emp3.display();
		
	}
}
