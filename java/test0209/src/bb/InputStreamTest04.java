package bb;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest04 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		os.write('a');
		os.write(65);
		os.flush();
		os.close();
		
		System.out.print("콘솔입력>>");
		InputStream is = System.in;
		byte[] byteArr = new byte[100];
		int count = is.read(byteArr);
		for(int i=0; i<count;i++) {
			System.out.println((char)byteArr[i]);
		}
		System.out.println("--------------------------------");
		int data;
		while((data=is.read())!='\r') {
			System.out.println("읽은 데이터:"+(char)data+" 남은 바이트 수:"+is.available());
		}
		is.close();

	}

}
