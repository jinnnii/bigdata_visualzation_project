package practice07;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class WordTest {
	Vector<Word> words = new Vector<Word>();
	Scanner sc = new Scanner(System.in);
	public WordTest() {
		words.add(new Word("apple","사과"));
		words.add(new Word("banana","바나나"));
		words.add(new Word("car","차"));
		words.add(new Word("doll","인형"));
		words.add(new Word("elephant","코끼리"));
	}
	public void test() {
		System.out.println("현재 "+words.size()+"개의 단어가 들어있습니다. -1을 입력하면 테스트를 종료합니다.");
		while(true) {
			int corAnswer;
			int[] select = new int[] {-1,-1,-1,-1};
			
			for(int i=0; i<select.length; i++) {
				int index;
				do {
					index = new Random().nextInt(words.size());
					
				}
				while(exists(select,index));
				select[i] = index;
			}
			corAnswer = new Random().nextInt(select.length);
			
			System.out.println(words.get(select[corAnswer]).getEn());
			for(int i=0; i<select.length; i++) {
				System.out.print("("+(i+1)+")");
				System.out.print(words.get(select[i]).getKr()+" ");
			}
			
			int answer = sc.nextInt();
			if(answer==-1) return;
			System.out.println(answer==corAnswer+1?"Excellent !!": "No !!");
			System.out.println();
		}
	}

	public void insert() {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		while (true) {
			String en;
			String kr;
			System.out.print("영어 한글 입력>>");
			en = sc.next();
			if (en.equals("그만"))
				return;
			kr = sc.next();
			words.add(new Word(en, kr));

		}
	}
	
	private boolean exists(int n[], int index) {
		for(int i : n) {
			if(i==index) return true;
		}
		return false;
	}
}

public class Hw04 {
	public static void main(String[] args) {
		int select=0;
		Scanner sc = new Scanner(System.in);
		WordTest wt = new WordTest();

		while (select != 3) {
			System.out.print("단어 테스트 :1. 단어 삽입 :2. 종료 :3 >>");
			select = sc.nextInt();
			switch (select) {
			case 1:
				wt.test();
				break;
			case 2:
				wt.insert();
				break;
			case 3:
				System.out.println("영어단어 게임 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}
}
