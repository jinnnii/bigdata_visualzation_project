package aa;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) {
		File pw1= new File("abc/printwriter1.txt");
		File pw2= new File("abc/printwriter2.txt");
		File pw3= new File("abc/printwriter3.txt");

		
		try(PrintWriter pw = new PrintWriter(pw1)){
			pw.println("PrintWriter ¿¹Á¦1");
			pw.println(13);
			pw.println(5.8);
			pw.printf("%d",40).printf("%s","Á¡");
			
		}catch(IOException e) {}
	}

}
