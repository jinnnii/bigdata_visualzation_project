package aa;

import java.io.IOException;
import java.io.InputStream;

public class SystemInTest02 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
//		byte[] bArr = new byte[5];
//		int count = is.read(bArr);
//		
//		for(int i=0; i<count; i++) {
//			System.out.print((char)bArr[i]);
//		}
//		System.out.print(" :count="+count);
//		System.out.println();
		
		int offset=3; int length=5;
		byte[] bArr = new byte[8]; //off+len
		int count = is.read(bArr, offset, length);
		for(int i=0; i<offset+count; i++) {
			System.out.print((char)bArr[i]);
		}
		
	}

}
