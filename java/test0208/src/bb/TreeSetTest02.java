package bb;

import java.util.TreeSet;

public class TreeSetTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("kim");
		ts.add("hong");
		ts.add("lee");
		ts.add("박");
		ts.add("김");
		System.out.println(ts); //in order
		
		TreeSet<Student> ts2 = new TreeSet<Student>();// class is not comparable (비교가 안됨)
		ts2.add(new Student(1,"hong","computer",new int[] {89,60,78}));
		ts2.add(new Student(3,"lee","scient",new int[] {69,80,98}));
		ts2.add(new Student(4,"yeun","computer",new int[] {69,80,98}));
		ts2.add(new Student(2,"kim","art",new int[] {69,80,98}));
		for (Student s : ts2) {
			System.out.println(s);
		}
		
		
	}

}
