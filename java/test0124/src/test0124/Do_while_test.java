package test0124;

public class Do_while_test {

	public static void main(String[] args) {
		int i=10;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		i=10;
		System.out.println("-------------------------");
		do {
			System.out.println(i);
			i++;
		}while(i<10);
	}

}
