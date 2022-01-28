package Homework;

public class Hw02 {

	public static void main(String[] args) {
		for(int i=1; i<=99; i++) {
			String str= String.valueOf(i);
			System.out.print(i);
			int count =0;
			for(int j=0; j<str.length();j++) {
				char ch = str.charAt(j);
				if(ch=='3'||ch=='6'||ch=='9') {
					count++;
				}
			}
			if(count>0) {
				System.out.print(" 박수");
				for(int j=0; j<count; j++) {
					System.out.print("짝");
				}
			}
			System.out.println();
		}

	}

}
