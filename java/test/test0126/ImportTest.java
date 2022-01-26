package test0126;

import test0126.AClass;

public class ImportTest {
	class TestB {
		void func() {
			System.out.println("TestB");
		}
	}

	static void sum(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			a[i] += b[i];
			System.out.println(a[i] + " ");
		}
	}

	public static void main(String[] args) {

	}

}
