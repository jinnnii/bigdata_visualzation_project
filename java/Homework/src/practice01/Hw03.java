package practice01;

public class Hw03 {

	public static void main(String[] args) {
		int[][] array = new int[][] {{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		System.out.print("  |");
		for(int i=0; i<array[1].length;i++) {
			System.out.print(array[1][i]+"\t");
		}
		System.out.println();
		System.out.println("--+---------------------------------------------------------------");
		for(int i=0; i<array[0].length; i++) {
			System.out.printf("%d | ",array[0][i]);
			for(int j=0; j<array[1].length; j++) {
				System.out.print((array[0][i]*array[1][j])+"\t");
			}
			System.out.println();
		}

	}

}
