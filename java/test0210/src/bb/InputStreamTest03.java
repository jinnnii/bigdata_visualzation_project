package bb;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamTest03 {

	public static void main(String[] args) throws IOException {
		byte[] byteArray = new byte[10];
		InputStream is = new FileInputStream("abc/newFile1.txt");
		int count;
		while((count=is.read(byteArray))!=-1) {
			System.out.print(new String(byteArray,0,count,Charset.forName("UTF-8"))+" ");
			System.out.println(": count="+count);
		}
		is.close();

	}

}

