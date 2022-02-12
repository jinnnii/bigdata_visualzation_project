package bb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> hSet = new HashSet<String>();
		hSet.add("A");
		hSet.add("B");
		hSet.add("C");
		System.out.println(hSet);
		
		for (int i=0; i<hSet.size(); i++) {
			//System.out.println(hSet.get(i)); error!
		}
		
		Iterator<String> it= hSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		hSet.remove("A"); //only object remove
		System.out.println(hSet.contains("A"));
		System.out.println(hSet.contains("B"));
		
		hSet.add("A"); //new
		hSet.add("B"); //existed
		System.out.println(hSet); //no duplication, no order list
		System.out.println("-----------------------------");
		LinkedHashSet<String> lhSet = new LinkedHashSet<String>();
		lhSet.add("A");
		lhSet.add("B");
		lhSet.add("C");
		lhSet.add("A");
		System.out.println(lhSet);
		
	}

}
