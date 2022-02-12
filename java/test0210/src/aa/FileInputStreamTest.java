package aa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		File dir = new File("abc");
		File f = new File("abc/newFile.txt");
		if(!dir.exists()) {
			dir.mkdir(); 
		}
		if(!f.exists()) {
			f.createNewFile();
		}
		
		InputStream is =new FileInputStream(f);
		
		int data;
		while((data=is.read())!=-1) {
			System.out.print((char)data+" ");
			System.out.println(is.available()); //남은 바이트 수
		}
	}

}
