package test0124;

public class Optest03 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		
		System.out.println(a>5 && b>3);
		System.out.println(a<5 && b>3);
		System.out.println(a>b || b>3);
		System.out.println(!(a>5));
		
		System.out.println("--------------------------");
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		
		System.out.println("--------------------------");
		
		String str="java";
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a==10);
		
		System.out.println(str=="java");
		
		System.out.println("--------------------------");
		a+=10;
		System.out.println(a);
		a-=5;
		System.out.println(a);
		System.out.println("--------------------------");

	}

}
