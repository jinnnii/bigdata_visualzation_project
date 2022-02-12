package aa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest01 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("abc/output1.txt");
		File f2 = new File("abc/output2.txt");
		
		if(!f1.exists()) f1.createNewFile();
		if(!f2.exists()) f2.createNewFile();
		
		OutputStream os1 = new FileOutputStream(f1);
		OutputStream os2 = new FileOutputStream(f2,true);
		
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');//13
		os1.write('c');
		os1.write('\n');//10
		os1.flush();
		os1.close();
		byte[] bArr = "Hello!".getBytes(); //string to byte
		os2.write(bArr);
		os2.write('\n');
		
		bArr = "Happy birth day to you".getBytes();
		os2.write(bArr,6,5);
		os2.close();
		OutputStream os3= new FileOutputStream(f1,false);
		
		bArr = "안녕하세요".getBytes();
		os3.write(bArr);
		os3.write('\n');
		os3.write(bArr,0,4);
		os3.write('\n');
		
		os1.close();
		os2.close();
		os3.close();
	}

}
