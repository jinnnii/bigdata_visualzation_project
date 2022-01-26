package test0126;

public class ArrayTest01 {
	static void sum(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + b[i];
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] b = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		sum(a, b);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
