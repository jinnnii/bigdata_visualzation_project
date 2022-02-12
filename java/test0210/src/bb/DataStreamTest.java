package bb;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamTest {

	public static void main(String[] args) {
		File dataFile = new File("abc/file.data");
		try(OutputStream os = new FileOutputStream(dataFile);
				DataOutputStream dos = new DataOutputStream(os);){
			dos.writeInt(10);
			dos.writeDouble(3.5);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
		}catch(IOException e) {
			
		}
		
		try(InputStream is = new FileInputStream(dataFile);
				DataInputStream dis = new DataInputStream(is);){
			int a = dis.readInt();
			double b = dis.readDouble();
			char c = dis.readChar();
			String d = dis.readUTF();
			System.out.println(a+" "+b+" "+c+" "+d);
		}catch(IOException e) {
			
		}
		
	}

}
