package bb;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest02 {
	public static void main(String[] args) {
		HashMap<Integer,Student> hm = new HashMap<Integer,Student>();
		hm.put(1, new Student(1,"aaa","b1",new int[] {89,68,99}));
		hm.put(2, new Student(2,"baa","b2",new int[] {45,68,99}));
		hm.put(3, new Student(3,"caa","b3",new int[] {89,58,99}));
		hm.put(3, new Student(4,"daa","b4",new int[] {89,68,87}));
		
		System.out.println(hm.get(1));
		Set<Integer> keys= hm.keySet();
		for(Integer key : keys) {
			System.out.println(hm.get(key));
		}
		
		HashMap<String,Integer> hm2 = new HashMap<String,Integer>();
		hm2.put("홍길동",80);
		hm2.put("김연아",90);
		hm2.put("제갈량",50);
		hm2.put("박준서",89);
		hm2.put("오바마",41);
		
		System.out.println(hm2.get("홍길동"));
		hm2.remove("홍길동");
		System.out.println(hm2.get("홍길동"));
	}

}
