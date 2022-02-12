package dd;

public abstract class Computer {
	public Computer() {}
	public Computer(int ssd, String cpu, int memory, String name) {
		super();
		this.ssd = ssd;
		this.cpu = cpu;
		this.memory = memory;
		this.name = name;
	}
	int ssd;
	String cpu;
	int memory;
	String name;
	
	void display() {
		System.out.println("My "+name+"입니다.");
	}
	public abstract void typing();
}


class DeskTop extends Computer{
	public DeskTop() {}
	public DeskTop(int ssd, String cpu, int memory, String name, int size) {
		super(ssd,cpu,memory,name);
		this.size = size;
	}

	int size;

	@Override
	public void typing() {
		System.out.println("모니터크기:"+size);
		System.out.printf("SSD:%d CPU:%s MEMORY:%dMB",ssd,cpu,memory);
		System.out.println();
	}
	
	
}