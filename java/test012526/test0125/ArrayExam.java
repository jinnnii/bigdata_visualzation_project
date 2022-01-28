package test0125;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score=new int[5][5];
		for(int i=0; i<score.length; i++) {
			int sum=0;
			for(int j=0; j<3; j++) {
				score[i][j]=(int)(Math.random()*40)+60;
				System.out.print(score[i][j]+" ");
				sum+=score[i][j];
			}
			score[i][3]=sum/3;
			System.out.println(score[i][3]);
		}
		
		for(int i=0; i<score.length; i++) {
			int rank=1;
			for(int j=0; j<score.length; j++) {
				if(score[j][3] > score[i][3]) {
					rank++;
				}
				score[i][4]=rank;
			}
		}
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
