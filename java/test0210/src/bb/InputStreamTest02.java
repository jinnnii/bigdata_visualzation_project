package bb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest02 {

	public static void main(String[] args) throws IOException {
		File inFile = new File("abc/newFile.txt");
		InputStream is = new FileInputStream(inFile);
		byte[] byteArray1 = new byte[10];
		int count;
//		while((count=is.read(byteArray1,1,2))!=-1) {
//			for(int i=0; i<1+count; i++) {	
		while((count=is.read(byteArray1))!=-1) {
			for(int i=0; i<count; i++) {	
				System.out.print((char)byteArray1[i]+" ");
			}
			System.out.println(":count="+count);
		}
		is.close();
	}

}