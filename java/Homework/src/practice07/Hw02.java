package practice07;

import java.util.Scanner;
import java.util.Vector;

public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> rains = new Vector<Integer>();
		int sum=0;
		
		while(true) {
			int rain;	
			System.out.print("������ �Է�(0 �Է½� ����)>>");
			rain = sc.nextInt();
			if(rain==0)break;
			rains.add(rain);
			sum+=rain;
			System.out.println("���� ���: "+sum/rains.size());
		}
		System.out.println("End");
	}

}
