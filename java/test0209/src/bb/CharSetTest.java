package bb;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharSetTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b1= "a".getBytes("EUC-KR");
		byte[] b2= "a".getBytes("MS949");
		System.out.println(b1.length); //1
		System.out.println(b2.length); //1
		
		
		byte[] b3= "가".getBytes("EUC-KR");
		byte[] b4= "가".getBytes("MS949");
		System.out.println(b3.length); //2
		System.out.println(b4.length); //2
		
		byte[] b5= "뷁".getBytes("EUC-KR");
		byte[] b6= "뷁".getBytes("MS949");
		System.out.println(b5.length); //1
		System.out.println(b6.length); //2
		System.out.println(new String(b5,"EUC-KR")); //?
		System.out.println(new String(b6,"MS949"));  //뷁
		
		byte[] b7= "a".getBytes("UTF-16");
		byte[] b8= "a".getBytes("UTF-8");
		byte[] b9= "aaaa".getBytes("UTF-16");
		byte[] b10= "aaaa".getBytes("UTF-8");
		System.out.println(b7.length); //4
		System.out.println(b8.length); //1
		System.out.println(b9.length); //10
		System.out.println(b10.length); //4 각 1byte
		
		byte[] b11= "가나다".getBytes("UTF-16");
		byte[] b12= "가나다".getBytes("UTF-8");
		System.out.println(b11.length); //8
		System.out.println(b12.length); //9 각 3byte
		
		byte[] array1 = "안녕하세요".getBytes();
		byte[] array2 = "안녕하세요".getBytes(Charset.defaultCharset());
		byte[] array3 = "안녕하세요".getBytes(Charset.forName("MS949"));
		byte[] array4 = "안녕하세요".getBytes("UTF-8");
		System.out.println(array1.length); //15 <-default: utf-8 로 설정
		System.out.println(array2.length); //15
		System.out.println(array3.length); //10
		System.out.println(array4.length); //15
		
		System.out.println(new String(array1));
		System.out.println(new String(array2, Charset.defaultCharset()));
		System.out.println(new String(array3, Charset.forName("MS949")));
		System.out.println(new String(array4,"UTF-8"));

	}

}
