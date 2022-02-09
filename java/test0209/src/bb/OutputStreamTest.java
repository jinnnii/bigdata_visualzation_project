package bb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		File outFile = new File("abc/out.txt");
		OutputStream os1 = new FileOutputStream(outFile,true);
		os1.write('J');
		os1.write('a');
		os1.write('v');
		os1.write('a');
		os1.write('\n');
		os1.write('a');
		
		byte[] byteArr="Hello".getBytes();
		os1.write(byteArr);
		
		byte[] byteArr2= "java programming".getBytes();
		os1.write(byteArr2,5,11);
		os1.flush();
		os1.close();

	}

}
