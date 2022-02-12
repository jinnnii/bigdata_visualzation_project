package aa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		File isrf = new File("abc/isrf.txt");
		
		try(Reader r = new FileReader(isrf)){
			int data;
			while((data=r.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {}
		
		System.out.println();
		
		try(InputStream is = new FileInputStream(isrf);
			Reader isr = new InputStreamReader(is,"UTF-8")){
			int data;
			while((data=isr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println(((InputStreamReader) isr).getEncoding());
		}catch(IOException e) {}
		
		try{
			InputStreamReader isr = new InputStreamReader(System.in,"MS949");
			int data;
			while((data=isr.read())!='\r') {
				System.out.print((char)data);
			}
		}catch(IOException e) {}
		
		try{
			InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");
			int data;
			while((data=isr.read())!='\r') {
				System.out.print((char)data);
			}
		}catch(IOException e) {}
	}

}
