package test0124;

public class BreakContinue_test {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;;i++) {
			sum+=i;
			if(sum>100)break;
			System.out.println("i:"+i+" sum:"+sum);
		}
		
		for(int i=1; i<=100; i++){
			if(i%3==0)continue;
			System.out.println(i);
		}

	}

}
