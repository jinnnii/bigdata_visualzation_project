package bb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderTest {

	public static void main(String[] args) {
		File infile = new File("abc/data.txt");
		ArrayList<Score> scores = new ArrayList<Score>();
		try(BufferedReader br = new BufferedReader(new FileReader(infile));){
			String data;
			while((data= br.readLine())!=null) {
				String[] sr = data.split(" ");
				scores.add(new Score(sr[0],Integer.parseInt(sr[1]), Integer.parseInt(sr[2]), Integer.parseInt(sr[3])));
			}
		}catch(IOException e) {
			
		}
		for(Score s : scores) {
			System.out.println(s);
		}

	}

}
