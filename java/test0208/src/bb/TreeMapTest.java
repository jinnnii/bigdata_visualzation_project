package bb;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(10, "aaa");
		tm.put(5, "bbb");
		tm.put(5, "ccc");
		tm.put(3,"bbb");
		System.out.println(tm);
	}

}
