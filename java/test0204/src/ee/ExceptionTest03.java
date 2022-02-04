package ee;

import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest03 {

	public static void main(String[] args) {
		InputStreamReader is = null;
		try {
			is = new InputStreamReader(System.in);
			System.out.println("키보드로부터 문자 입력");
			System.out.println((char)is.read());
		} catch (IOException e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
		try(InputStreamReader is2 = new InputStreamReader(System.in);){
			System.out.println("문자입력");
			System.out.println(is2.read());
		}catch(IOException e) {
			System.out.println("예외처리");
		}
	
		
		InputStreamReader is3 = null;
		try {
			is3 = new InputStreamReader(System.in);
			System.out.println("키보드로부터 문자 입력");
			System.out.println((char)is3.read());
		} catch (IOException e) {
			System.out.println("오류");
			e.printStackTrace();
		}

	}

}
