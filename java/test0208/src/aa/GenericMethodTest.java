package aa;

public class GenericMethodTest {

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		String str1= gm.<String>method1("안녕");
		String str2= gm.method1("안녕");
		System.out.println(str1+","+str2);
		
		boolean bool1 = gm.<Double>method2(2.5,2.5);
		boolean bool2 = gm.method2(2.5, 2);
		System.out.println(bool1+", "+bool2);
		
		gm.<String,Integer>method3("국어",80);
		gm.method3("영어", 30);
	}

}
