package Homework;

import java.util.Scanner;

public class Hw07 {

	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		int[][] result = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 배열의 값을 9개 입력하시오");
		for(int[] i : array1) {
			for(int j: i) {
				j= sc.nextInt();
			}
		}
		System.out.println("두번째 배열의 값을 9개 입력하시오.");
		for(int[] i : array2) {
			for(int j: i) {
				j= sc.nextInt();
			}
		}
		
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array1[i].length; j++) {
				result[i][j] = array1[i]*array2[j]
			}
		}
		sc.close();

	}

}