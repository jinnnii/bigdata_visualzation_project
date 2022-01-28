package test0125;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int[2][3];
		int value=1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=value++;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
