package aa;

import java.io.IOException;
import java.io.InputStream;

public class SystemInTest {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		int data;
		while((data=is.read())!='\r') {
			System.out.print((char)data+" ");
			System.out.println(is.available());
		}
		System.out.println(data);
		System.out.println(is.read());

	}

}
