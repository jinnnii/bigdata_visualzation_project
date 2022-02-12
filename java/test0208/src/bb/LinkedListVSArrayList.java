package bb;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVSArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> lList = new LinkedList<Integer>();
		
		long startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			aList.add(0,1);
		}
		long endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 추가 시간:"+(endTime-startTime));
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			lList.add(0,1);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 추가 시간:"+(endTime-startTime));
		
		
		startTime = System.nanoTime();
		for(int i=0; i<aList.size(); i++) aList.remove(0);
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 삭제 시간:"+(endTime-startTime));
		
		startTime = System.nanoTime();
		for(int i=0; i<lList.size(); i++) lList.remove(0);
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 삭제 시간:"+(endTime-startTime));
		
		
		startTime = System.nanoTime();
		for(int i=0; i<aList.size(); i++) aList.get(0);
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 검색 시간:"+(endTime-startTime));
		
		startTime = System.nanoTime();
		for(int i=0; i<lList
				.size(); i++) lList.get(0);
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 검색 시간:"+(endTime-startTime));
	}

}
