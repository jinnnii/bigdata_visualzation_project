package test0124;

public class ForTest01 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("for end:"+i);
		
		for (int j =1,k=1;(j+k)<10;j++,k++) {
			System.out.println("j:"+j+", k:"+k+", j+k:"+(j+k));
		}
	}

}
