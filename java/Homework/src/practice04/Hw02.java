package practice04;

import java.util.Arrays;

public class Hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= new int[] {15,7,2,9,10,12,17,11,20,5};
		System.out.println("\t"+Arrays.toString(array));
		for(int i=0; i<array.length;i++) {
			int min_pos = i;
			for(int j=i+1; j<array.length; j++) {
				if (array[j]<array[min_pos]) {
					min_pos = j;
				}
			}
			int temp = array[i];
			array[i] = array[min_pos];
			array[min_pos] = temp;
			System.out.print(i+1 + ":\t");
			System.out.println(Arrays.toString(array));
		}
	}

}
