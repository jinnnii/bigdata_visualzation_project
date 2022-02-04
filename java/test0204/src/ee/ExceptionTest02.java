package ee;

import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest02 {

	public static void main(String[] args) {
		try(InputStreamReader is = new InputStreamReader(System.in);){
			System.out.println("문자입력");
			System.out.println(is.read());
		}catch(IOException e) {
			System.out.println("예외처리");
		}
	}

}
