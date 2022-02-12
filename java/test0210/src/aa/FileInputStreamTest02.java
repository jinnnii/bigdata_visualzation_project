package aa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest02 {

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
		
//		byte[] bArr = new byte[10];
//		int count;
//		while((count=is.read(bArr))!=-1) {
//			for(int i=0; i<count; i++) {
//				System.out.print((char)bArr[i]);
//			}
//			System.out.println();
//		}
		
		int offset = 3; int length=6;
		byte[] bArr = new byte[10];
		int count = is.read(bArr, offset, length);
		
		for(int i =0; i<offset+count; i++) {
			System.out.print((char)bArr[i]);
		}

	}

}
