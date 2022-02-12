package bb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student(1,"홍홍홍","컴공",new int[] {85,89,90}));
		stdList.add(new Student(2,"길길길","컴공",new int[] {90,59,70}));
		stdList.add(new Student(3,"동동동","컴공",new int[] {65,75,90}));
		stdList.add(new Student(4,"홍길동","컴공",new int[] {98,79,30}));
		stdList.add(new Student(5,"홍길미","컴공",new int[] {55,44,60}));
		
//		System.out.println(stdList);
		for(Student std:stdList) {
			System.out.println(std.toString());
		}
		System.out.println();
		
		List<Student> stdVector = new Vector<Student>();
		stdVector.add(new Student(1,"홍홍홍","컴공",new int[] {85,89,90}));
		stdVector.add(new Student(2,"길길길","컴공",new int[] {90,59,70}));
		stdVector.add(new Student(3,"동동동","컴공",new int[] {65,75,90}));
		stdVector.add(new Student(4,"홍길동","컴공",new int[] {98,79,30}));
		stdVector.add(new Student(5,"홍길미","컴공",new int[] {55,44,60}));
		
		for(Student std:stdVector) {
			System.out.println(std.toString());
		}
		
		System.out.println();
		List<Student> stdLinked = new LinkedList<Student>();
		stdLinked.add(new Student(1,"홍홍홍","컴공",new int[] {85,89,90}));
		stdLinked.add(new Student(2,"길길길","컴공",new int[] {90,59,70}));
		stdLinked.add(new Student(3,"동동동","컴공",new int[] {65,75,90}));
		stdLinked.add(new Student(4,"홍길동","컴공",new int[] {98,79,30}));
		stdLinked.add(new Student(5,"홍길미","컴공",new int[] {55,44,60}));
		
		for(Student std: stdLinked) {
			System.out.println(std.toString());
		}
	}

}
