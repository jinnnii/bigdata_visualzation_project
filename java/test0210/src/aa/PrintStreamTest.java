package aa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) {
		File f1 = new File("abc/print1.txt");
		File f2 = new File("abc/print2.txt");
		
		try(OutputStream os = new FileOutputStream(f1);
			PrintStream ps = new PrintStream(os)){
			
			ps.println(5.8);
			ps.print(1+" ¾È³ç "+123+'\n');
			ps.printf("%d",10);
			ps.println();
			
		}catch(IOException e) {}
		
		try(PrintStream ps = new PrintStream(f2)){
				
				ps.println(5.8);
				ps.print(1+" ¾È³ç "+123+'\n');
				ps.printf("%d",10);
				ps.println();
				
			}catch(IOException e) {}


	}

}
