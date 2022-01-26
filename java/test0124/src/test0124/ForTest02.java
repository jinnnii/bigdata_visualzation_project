package test0124;

public class ForTest02 {

	public static void main(String[] args) {
		for(int i=1, sum=0; i<=100; i++) {
			sum+=i;
			System.out.println(sum);
		}
		for(int i=0, sum=0; i<=100; i++) {
			if(i%5==0) {
				sum+=i;
				System.out.println("i:"+i+" sum:"+sum);
			}
		}
		
		for(int i=0, sum=0; i<=100; i+=5) {
			sum+=i;
			System.out.println("i:"+i+" sum:"+sum);
		}

	}

}
