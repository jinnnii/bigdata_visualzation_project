package test0125;

public class StringTest01 {

	public static void main(String[] args) {
		System.out.println(String.valueOf(1));
		System.out.println(String.valueOf(3.5));
		System.out.println("자바".concat(" 프로그래밍"));
		String str = "java8";
		byte[] bs = str.getBytes();
		for(byte b:bs) {
			System.out.println(b);
		}
		char[] chs = str.toCharArray();
		for(char ch:chs) {
			System.out.println(ch);
		}

	}

}
