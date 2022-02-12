package cc;

public interface Computer {
	void display(String name);
	void typing(int ssd, int cpu, int memory);
}

class Desktop implements Computer{
	@Override
	public void display(String name) {
		System.out.println("My "+name+" 컴퓨터입니다.");
	}
	@Override
	public void typing(int ssd, int cpu, int memory) {
		System.out.printf("SSD:%d, CPU:i%d, 메모리:%dMB 입니다.",ssd,cpu,memory);
		System.out.println();
	}
}