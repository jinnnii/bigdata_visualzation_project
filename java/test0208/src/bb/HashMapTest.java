package bb;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(10, "abc");
		hmap.put(4, "bcd");
		hmap.put(5, "bbc");
		System.out.println("hmap:"+hmap);
		Map<Integer,String> hmap2 = new HashMap<Integer,String>();
		hmap2.putAll(hmap);
		hmap2.put(4, "aaa");
		System.out.println("hmap2:"+hmap2);
		
		System.out.println(hmap.get(10));
		System.out.println(hmap.get(2));
		hmap.replace(10, "bbb");
		hmap.replace(4, "bcd","aaa");
		hmap.replace(4, "aaa", "aa");
		System.out.println(hmap.get(4));
		System.out.println(hmap);
		
		System.out.println(hmap.containsKey(4));
		System.out.println(hmap.containsKey(2));
		System.out.println(hmap.containsValue("aa"));
		
		Set<Integer> keys = hmap.keySet();
		System.out.println(keys);
		for(Integer k : keys) {
			System.out.println(k+" : "+hmap.get(k));
		}
		
		
	}

}
