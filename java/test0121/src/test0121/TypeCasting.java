package test0121;

public class TypeCasting {
	public static void main(String[] args) {
		int a=10;
		float f = 3.5f;
		float result = a+f;
		//int result2 = a+f;오류
		int result2 = (int)(a+f);
		int result3 = (int)10L;
		byte b =(byte)a;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println(10/3);
		System.out.println(10.0/3.0);
		System.out.println((float)(10/3));
		System.out.println((float)10/3);
	}
}
