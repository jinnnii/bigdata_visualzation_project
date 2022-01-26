package test0125;

public class ForHw {

	public static void main(String[] args) {
		//다이아몬드 만들기
				for(int i=0; i<10; i++) {
					for(int j=-9; j<9; j++) {
						if(j> -i && j<i) {
							System.out.print("✨");
						}else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				for(int i=9; i>=0; i--) {
					for(int j=-9; j<9; j++) {
						if(j> -i && j<i) {
							System.out.print("✨");
						}else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}

	}

}
