package test0126;

public class MethodOverloaidngTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingClass obj = new MethodOverloadingClass();
		int[] a = {1,2,3,4,5,6,7,8,9};
		obj.print();
		obj.print(10);
		obj.print(10.5);
		obj.print(10,20);
		
		obj.method1(a);
		obj.method1(1,2,3,4,5);
	}

}
