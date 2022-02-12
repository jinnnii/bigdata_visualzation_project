package bb;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		String wd = System.getProperty("user.dir");
		File abcDir = new File(wd+"/abc");
		if(!abcDir.exists()) {
			abcDir.mkdir();
		}
		
		File newFile = new File(wd+"/abc/newFile.txt");
		if(!newFile.exists()) {
			newFile.createNewFile();
		}
		
		File newFile2 = new File(wd+"\\abc\\newFile.txt");
		File newFile3 = new File(wd+File.separator+"abc"+File.separator+"newFile.txt");
		File newFile4 = new File(wd+"/abc/newFile.txt");
		
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		System.out.println(newFile4.exists());

		System.out.println(newFile2.getAbsolutePath());
		File newDir = new File("abc");
		if(!newDir.exists()) {
			newDir.mkdir();
		}
		
		File f1 = new File("abc/newFile1.txt");
		if(!f1.exists()) f1.createNewFile();
		
		System.out.println(newDir.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.getName());
		System.out.println(f1.getParent());
		System.out.println(f1.getPath());
		
		File dir2 = new File("abc/bbb/ccc");
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		File file = new File("C:/kej/project/java");
		File[] fnames =file.listFiles();
		for(File fname : fnames) {
			System.out.println((fname.isDirectory()?"폴더 ":"파일 ")+fname.getName());
		}
	}

}
