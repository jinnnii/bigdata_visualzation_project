package bb;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedTest {

	public static void main(String[] args) throws IOException {
		File orgFile = new File("abc/img.jpg");
		File copyFile1 = new File("abc/bbb.jpg");
		File copyFile2 = new File("abc/ccc.jpg");
		
		//Buffered 사용 없음
		long start, end, time1, time2;
		start =System.nanoTime();
		InputStream is = new FileInputStream(orgFile);
		OutputStream os = new FileOutputStream(copyFile1);
		int data;
		while((data=is.read())!=-1) {
			os.write(data);
		}
		end = System.nanoTime();
		time1 = end-start;
		System.out.println("Without BufferedXXXStream:"+time1);
		
		start = System.nanoTime();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(orgFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFile2));
		int data2;
		while((data2=bis.read())!=-1) {
			bos.write(data2);
		}
		bos.flush();
		end = System.nanoTime();
		time2 = end-start;
		System.out.println("With BufferedXXXStream:"+time2);
		System.out.println("Ratio of with and without :" +(time1/time2));
		
		is.close();
		os.close();
		bis.close();
		bos.close();

	}

}
