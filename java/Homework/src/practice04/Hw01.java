package practice04;

public class Hw01 {

	public static void main(String[] args) {
		int[][] array = new int[4][];
		array[0] = new int[]{78,48,78,98};
		array[1] = new int[]{99,92};
		array[2] = new int[]{29,64,83};
		array[3] = new int[]{34,78,92,56};

		for(int i=0; i<array.length; i++) {
			int sum=0;
			for(int j = 0; j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
				sum+=array[i][j];
			}
			System.out.print(sum+" ");
			System.out.printf("%.1f",(float)sum/array[i].length);
			System.out.println();
		}
	}

}
