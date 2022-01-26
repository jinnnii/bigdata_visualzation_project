package test0124;

public class Optest02 {

	public static void main(String[] args) {
		int a = 3; 	//00000011
		int b = 10;	//00001010
		
		System.out.println(a&b); 	//0000010=2
		System.out.println(a|b);	//00001011=11
		System.out.println(a^b);	//00001001=9
		System.out.println(~a);		//11111100=-4
		
		System.out.println();
		
		System.out.println(Integer.toBinaryString(b)); //2진수 1010
		System.out.println(Integer.toOctalString(b)); //8진수 12
		System.out.println(Integer.toHexString(b)); //16진수 a
		
		System.out.println();
		
		System.out.println(Integer.parseInt("1010",2));
		System.out.println(Integer.parseInt("12",8));
		System.out.println(Integer.parseInt("a",16));
		System.out.println(Integer.parseInt("10"));
		
		System.out.println("---------------------");
		
		System.out.println("b<<1: "+(b<<1)); //b*2 =20
		System.out.println("b<<2: "+(b<<2)); //b*4 =40
		System.out.println("b>>1: "+(b>>1)); //b/2 =5
		System.out.println("b>>1: "+(b>>2)); //b/4 = 2
		
		int c= -5; //0b11111011
		System.out.println("c>>1: "+(c>>1)); //(-5/2)-1 = -3
		System.out.println("c>>>1: "+(c>>>1));//0(양수)1111...111101
	
		System.out.println("---------------------");
		
		System.out.println(5<<2); //5*4
		System.out.println(0b00000101<<2); //0b00010100
		
		System.out.println(-5>>2+1); //5/4
		System.out.println((byte)0b11111011>>2+1); //0b11111110
	}

}
