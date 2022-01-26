package test0124;

public class ForForExam {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1 ;j<=9; j++) {
				System.out.printf("%d x %d= %d\n",i,j,i*j);
			}
			System.out.println();
			
		}
		System.out.println("---------------------------------");
		for(int i=1;i<=5; i++) {
			for(int j=i; j<i+5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		for(int i=1; i<11; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("✨");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------");
		for(int i=11; i>1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print("✨");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------");
		for(int i=0; i<10; i++) {
			for(int j=-9; j<=9; j++) {
				if(j>=-i &&j<=i)
					System.out.print("✨");
				else System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=0; i<10; i--) {
			for(int j=-9; j<=9; j++) {
				if(j<=-i &&j>=i)
					System.out.print("✨");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
