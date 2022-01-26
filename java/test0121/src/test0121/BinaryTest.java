package test0121;

public class BinaryTest {

	public static void main(String[] args) {
		int num = 10;// 10
		int bNum = 0B1010; // 2 = 2+8
		int oNum = 012; // 8 = (1*2)+8
		int hNum = 0XA; // 16 = 10

		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);

		System.out.printf("8진수 출력: %o\n", num);
		System.out.printf("10진수 출력: %d\n", num);
		System.out.printf("16진수 출력: %x\n", num);

		// println : 한 줄 출력 후 줄바꿈
		// printf :특정 포맷(f)으로 출력
	}

}
