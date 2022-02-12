package aa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferWRTest {

	public static void main(String[] args) {
		File bf = new File("abc/frw.txt");

		try(Writer w = new FileWriter(bf);
				BufferedWriter bw = new BufferedWriter(w);){
				bw.write("¾È³çÇÏ¼¼¿ä\n".toCharArray()); //string->char
				bw.write("Hello world!");
				bw.write('\r');
				bw.write('\n');
				bw.write("¹Ý°©½À´Ï´Ù",0,2);
				bw.flush();
			}catch(IOException e) {}

		try(Reader r = new FileReader(bf);
			BufferedReader br = new BufferedReader(r);	){
			String data;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
		}catch(IOException e) {}
	
	}

}
