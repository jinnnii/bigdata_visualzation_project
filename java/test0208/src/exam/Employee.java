package exam;

public class Employee implements Comparable<Employee>{
	private int eno;
	private String name;
	private String position;
	private String dept;
	private int sal;
	
	public Employee(int eno, String name, String position, String dept, int sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.position = position;
		this.dept = dept;
		this.sal = sal;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return eno + ", " + name + ", " + position + ", " + dept + ", " + sal;
	}

	@Override
	public int compareTo(Employee o) {
		if(eno>o.eno) return -1;
		else if (eno==o.eno) return 0;
		else return 1;
	}
	
	
	
}
