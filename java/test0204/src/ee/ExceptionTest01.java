package ee;

import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest01 {

	public static void main(String[] args) {
		InputStreamReader is = null;
		try {
			is = new InputStreamReader(System.in);
			System.out.println("키보드로부터 문자 입력");
			System.out.println((char)is.read());
		} catch (IOException e) {
			System.out.println("오류");
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e) {
				}
			}
		}

	}

}
