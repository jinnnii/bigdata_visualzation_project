package aa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		File oswf = new File("abc/oswf.txt");
		try(OutputStream os = new FileOutputStream(oswf);
			OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");){
			
			osw.write("OutputStreamWriter Text File\n");
			osw.write("한글과 영문이 모두 포함되어 있습니다.");
			osw.flush();
			System.out.println(osw.getEncoding());
			
		}catch(IOException e) {}
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out,"MS949");
			osw.write("OutputStreamWriter를 이용한\n".toCharArray());
			osw.write("콘솔출력 예제입니다.\n한글과 영문이 포함되어 있습니다.");
			osw.write('\n');
			osw.flush();
			System.out.println(osw.getEncoding());
		}catch(IOException e) {}
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out,"UTF-8");
			osw.write("OutputStreamWriter를 이용한\n".toCharArray());
			osw.write("콘솔출력 예제입니다.\n한글과 영문이 포함되어 있습니다.");
			osw.write('\n');
			osw.flush();
			System.out.println(osw.getEncoding());
		}catch(IOException e) {}

	}

}
