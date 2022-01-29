package practice01;

import java.util.Scanner;

public class Hw07 {

	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		int[][] result = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 배열의 값을 9개 입력하시오");
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array1[i].length;j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		System.out.println("두번째 배열의 값을 9개 입력하시오.");
		for(int i=0; i<array2.length;i++) {
			for(int j=0; j<array2[i].length;j++) {
				array2[i][j] = sc.nextInt();
			}
		}
	
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array1.length; j++) {
				int sum=0;
				for(int k=0; k<array1[j].length; k++) {
					sum += array1[i][k]*array2[k][j];
				}
				result[i][j] = sum;
			}
		}
		
		arrayPrint(array1);
		System.out.println("---------------------");
		arrayPrint(array2);
		System.out.println("---------------------");
		arrayPrint(result
				);
		sc.close();

		
	}
	public static void arrayPrint(int[][] array) {
		for(int[] i : array) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
