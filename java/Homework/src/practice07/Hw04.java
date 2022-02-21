package practice07;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class WordTest {
	Vector<Word> words = new Vector<Word>();
	Scanner sc = new Scanner(System.in);
	public WordTest() {
		words.add(new Word("apple","���"));
		words.add(new Word("banana","�ٳ���"));
		words.add(new Word("car","��"));
		words.add(new Word("doll","����"));
		words.add(new Word("elephant","�ڳ���"));
	}
	public void test() {
		System.out.println("���� "+words.size()+"���� �ܾ ����ֽ��ϴ�. -1�� �Է��ϸ� �׽�Ʈ�� �����մϴ�.");
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
		System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
		while (true) {
			String en;
			String kr;
			System.out.print("���� �ѱ� �Է�>>");
			en = sc.next();
			if (en.equals("�׸�"))
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
			System.out.print("�ܾ� �׽�Ʈ :1. �ܾ� ���� :2. ���� :3 >>");
			select = sc.nextInt();
			switch (select) {
			case 1:
				wt.test();
				break;
			case 2:
				wt.insert();
				break;
			case 3:
				System.out.println("����ܾ� ���� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}

	}
}
