package aa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> hSet = new HashSet<Integer>();
		hSet.add(1);
		hSet.add(2);
		hSet.add(3);
		hSet.add(3);
		hSet.add(5);
		hSet.add(4);
		
		Set<Integer> lSet = new LinkedHashSet<Integer>();
		lSet.add(1);
		lSet.add(2);
		lSet.add(3);
		lSet.add(3);
		lSet.add(5);
		lSet.add(4);
		
		Set<Integer> tSet=  new TreeSet<Integer>();
		tSet.add(1);
		tSet.add(2);
		tSet.add(3);
		tSet.add(3);
		tSet.add(5);
		tSet.add(4);
		
		System.out.println(hSet);
		System.out.println(lSet);
		System.out.println(tSet);

	}

}
