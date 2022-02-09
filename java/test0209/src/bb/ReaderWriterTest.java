package bb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("abc/file1.txt");
		try(Writer wr = new FileWriter(file1);){
			char[] a ="안녕".toCharArray();
			wr.write("안녕하세요");
			wr.write(a);
			wr.write('\n');
			wr.write('A');
			wr.write('\n');
			wr.write("반갑습니다",2,3);
			wr.flush();
		}catch(IOException e) {}
		
		try(Reader r= new FileReader(file1);
				BufferedReader br = new BufferedReader(r)){
			String data;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
		}catch(IOException e) {}
	}

}
