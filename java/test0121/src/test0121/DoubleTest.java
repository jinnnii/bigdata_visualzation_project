package test0121;

public class DoubleTest {

	public static void main(String[] args) {
		double dnum=1;
		
		for(int i=0; i<10000; i++) {
			dnum=dnum+0.1;
		}
		//예상 결과 값 : 1001
		//실제 결과 값 : 1001.000000000159
		System.out.println(dnum);
	}

}
