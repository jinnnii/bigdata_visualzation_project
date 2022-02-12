package aa;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BuffedDataStreamTest {

	public static void main(String[] args) {
		File df = new File("abc/dataFile2.data");
		
		try(OutputStream os = new FileOutputStream(df);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);){
			
			dos.writeInt(35);
			dos.writeDouble(3.5);
			dos.writeChar('A');
			dos.writeUTF("æ»≥Á«œººø‰");
			dos.flush();
			
		}catch(IOException e) {}

		try(InputStream is = new FileInputStream(df);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);){
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		}catch(IOException e) {}
	}

}
