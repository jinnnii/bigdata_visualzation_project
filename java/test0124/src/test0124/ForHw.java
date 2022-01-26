package test0124;

public class ForHw {

	public static void main(String[] args) {
		for (int i = 0, hol = 0, jjak = 0; i <=100; i++) {
			if (i % 2 == 0) {
				jjak += i;
				System.out.println("짝수:" + jjak);
			} else {
				hol += i;
				System.out.println("홀수:"+hol);
			}
		}
	}
}
