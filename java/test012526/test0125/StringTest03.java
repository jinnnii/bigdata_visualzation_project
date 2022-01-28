package test0125;

import java.util.StringTokenizer;

public class StringTest03 {
	public static void main(String[] args) {
		String str="씽2게더, 스파이더맨:노 웨이 홈- 특송- 경관의 피- 하우스 오브 구찌";
		String[] strArray = str.split(",|-");
		for(String i:strArray) {
			i=i.trim();
			System.out.println(i);
		}
		
		System.out.println();
		StringTokenizer st = new StringTokenizer(str,",-");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
