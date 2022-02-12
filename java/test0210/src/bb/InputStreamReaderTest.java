package bb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		File inFile = new File("abc/out.txt");
		try(Reader reader = new FileReader(inFile);){
			int data;
			while((data=reader.read())!=-1) {
				System.out.println((char)data);
			}
		}catch(IOException e) {}
		
		try(InputStream is = new FileInputStream(inFile);
				InputStreamReader isr = new InputStreamReader(is,"MS949");
				BufferedReader br = new BufferedReader(isr);){
			String data;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
			System.out.println(isr.getEncoding());
		}catch(IOException e) {}
	}

}
