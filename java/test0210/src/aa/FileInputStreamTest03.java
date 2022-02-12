package aa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest03 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc/newFile2.txt");
		if(!f.exists()) f.createNewFile();
		InputStream is = new FileInputStream(f);
		
//		byte[] bArr = new byte[9];
//		int count;
//		while((count=is.read(bArr))!=-1) {
//			String str = new String(bArr,0,count,"UTF-8");
//			System.out.print(str);
//			System.out.println(" :count="+count);
//		}
		
		int offset=3; int length =6;
		byte[] bArr = new byte[9];
		int count = is.read(bArr,offset,length);
		
		String str = new String(bArr,0,offset+count,"UTF-8");
		System.out.println(str);
		
		is.close();
	}

}
