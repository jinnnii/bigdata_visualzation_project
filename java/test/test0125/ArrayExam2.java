package test0125;

public class ArrayExam2 {

	public static void main(String[] args) {
		int[][] scoreRank = new int[5][2];
		
		for(int i=0; i<scoreRank.length; i++) {
			int rank=1;
			scoreRank[i][0] = (int)(Math.random()*40)+60;
		}
		

	}

}
