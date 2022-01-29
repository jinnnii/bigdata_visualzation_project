package practice01;

import java.util.Arrays;

public class Hw06 {

	public static void main(String[] args) {
		int[] array = { 15, 7, 2, 9, 10, 12, 17, 11, 20, 5 };

		int[] select = array.clone();
		int[] insert = array.clone();
		int[] bubble = array.clone();

		System.out.println(Arrays.toString(array));
		System.out.println("선택 정렬");
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			temp(select, min, i);

			for (int j : select) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		System.out.println("----------------------------");

		System.out.println("삽입 정렬");
		for (int i = 1; i < insert.length; i++) {
			int pos = insert[i];
			int prev = i - 1;
			while ((prev >= 0) && (insert[prev] > pos)) {
				insert[prev + 1] = insert[prev];
				prev--;
			}
			insert[prev + 1] = pos;
			System.out.println(Arrays.toString(insert));
		}

		System.out.println("----------------------------");
		System.out.println("버블 정렬");
		for (int j = bubble.length; j > 0; j--) {
			for (int i = 1; i < j; i++) {
				int prev = i-1;
				if (bubble[prev] > bubble[i]) {
					temp(bubble, prev, i);
				}
			}
			System.out.println(Arrays.toString(bubble));
		}

	}

	public static void temp(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
