package aa;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File df = new File("abc/dataFile.data");
		if(!df.exists()) df.createNewFile();
		
		try(OutputStream os = new FileOutputStream(df);
			DataOutputStream dos = new DataOutputStream(os);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("æ»≥Á«œººø‰");
		}catch(IOException e) {}
		
		try(InputStream is = new FileInputStream(df);
			DataInputStream dis = new DataInputStream(is);){
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}catch(IOException e) {
			
		}
	}

}
