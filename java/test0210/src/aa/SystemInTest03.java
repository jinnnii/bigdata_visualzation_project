package aa;

import java.io.IOException;
import java.io.InputStream;

public class SystemInTest03 {

	public static void main(String[] args) throws IOException {
		InputStream is= System.in;
		int off=2; int len =4;
		byte[] bArr =new byte[6];
		int count = is.read(bArr,off,len);
		
		String str = new String(bArr,0,off+count,"MS949");
		System.out.println(str);
		

	}

}
