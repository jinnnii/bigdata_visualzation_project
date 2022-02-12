package aa;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BuffedStreamTest01 {

	public static void main(String[] args) throws IOException {
		File org = new File("abc/origin.png");
		File copy1 = new File("abc/copy1.png");
		File copy2 = new File("abc/copy2.png");
		
		//buffed를 사용하지 않는 경우
		long start, end, time1, time2;
		start = System.nanoTime();
		try (InputStream is = new FileInputStream(org);
				OutputStream os = new FileOutputStream(copy1)){
			int data;
			while((data=is.read())!=-1) {
				os.write(data);
			}
			os.flush();
		} catch (FileNotFoundException e) {}
		end= System.nanoTime();
		time1 = end-start;
		System.out.println("without buffer : "+time1);
		
		start =System.nanoTime();
		try(InputStream is = new FileInputStream(org);
				OutputStream os = new FileOutputStream(copy2);
				BufferedInputStream bis = new BufferedInputStream(is);
				BufferedOutputStream bos = new BufferedOutputStream(os)){
			int data;
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
		}catch(IOException e) {}
		end = System.nanoTime();
		time2= end-start;
		System.out.println("with buffer : "+time2);

	}

}
