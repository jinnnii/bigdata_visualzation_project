package practice01;

public class Hw06 {

	public static void main(String[] args) {
		int[] array = {15,7,2,9,10,12,17,11,20,5};
		
		System.out.println("선택 정렬");
		for (int i=0; i<array.length;i++) { 
			int min=i;
			for(int j=i; j<array.length;j++) {
				if(array[min]>array[j]) {
					min=j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
			
			for(int j : array) {
				System.out.print(j+ " ");
			}
			System.out.println();
			
		}
		System.out.println("----------------------------");
		
		
		System.out.println("삽입 정렬");
		for(int i=1; i<array.length;i++) {
			for(int j=i-1; j>=0; j--) {
				if(array[j]>array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			for(int j : array) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}
