package bb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> aList1 = new ArrayList<Integer>();
		List<Integer> aList2 = new ArrayList<Integer>(30);
		
		List<String> vList1 = new Vector<String>();
		List<Double> vList2 = new Vector<Double>(30);
		
		List<String> lList1 = new LinkedList<String>();
		//List<String> lList2 = new LinkedList<String>(30);
		
		List<Integer> asList1 = Arrays.asList(1,2,3,4,5);
		List<String> asList2 =Arrays.asList("a","b");
		
		aList1.add(10); aList1.add(20);aList1.add(30);
		aList1.add(1,40);
		aList1.addAll(asList1);
		aList1.addAll(1,asList1);
		aList1.set(0, 100);
		aList1.remove(1);
//		aList1.remove((Integer)100);
		aList1.remove(new Integer(100));
		//vList1.remove("java");
		//aList1.clear();
		for(int al : aList1) {
			System.out.print(al+" ");
		}
		System.out.println();
		System.out.println(aList1.get(0));
		
		System.out.println(aList1.size());
		System.out.println(aList1.isEmpty());
		Object[] obj = aList1.toArray();
		Integer[] arr = aList1.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr));
		
		vList1.add("java"); vList2.add(3.5);
		String[] arr2 = new String[0];
		arr2 = vList1.toArray(arr2);
		
		lList1.add("java");
		//asList1.add(1); asList2.add("c"); 크기 고정, 데이터는 수정 가능
		//asList1.remove(1);
		asList1.set(0, 6);
		
		System.out.println(aList1);
		System.out.println(aList1.toString());
		System.out.println(aList2);
		System.out.println(vList1);
		System.out.println(vList2);
		System.out.println(lList1);
		System.out.println(asList1);
		System.out.println(asList2);
		
		
	}

}
