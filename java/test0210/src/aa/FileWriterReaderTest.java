package aa;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileWriterReaderTest {

	public static void main(String[] args) {
		File rwf = new File("abc/rw.txt");
		
		try(Writer w = new FileWriter(rwf)){
			w.write("¾È³çÇÏ¼¼¿ä\n".toCharArray()); //string->char
			w.write("Hello world!");
			w.write('\r');
			w.write('\n');
			w.write("¹Ý°©½À´Ï´Ù",0,2);
			w.flush();
		}catch(IOException e) {}

		try(Reader r = new FileReader(rwf);){
			int data;
			while((data=r.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {}
	}

}
