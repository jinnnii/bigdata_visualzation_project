package ee;
class A1{
	
}

class A2 extends A1{
	
}
public class A {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		int[] a= new int[5];
//		try {
//			a[5]=0;
//		}catch(Exception e) {
//			System.out.println("index error");
//		}
//		System.out.println("end");
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Class cls=Class.forName("java.lang.Object");
//		------------------------------------------
//		A1 a1 = new A1();		
//		A1 a2 = new A2(); // up casting
//		A2 a3 = (A2)a1; //down casting
//		
//		int[] a= {1,2,3};
//		int num = Integer.parseInt("10!");
//		System.out.println(num);
//		String str = null;
//		-------------------------------------------
		int[] arr= new int[10];
		try {
//			int a = Integer.parseInt("20!");
//			System.out.println(3/0);
			System.out.println(arr[10]);
			//System.out.println("프로그램 종료");
		}
//		catch(Exception E) { //하위 예외 에러남(모든 에러를 받기 때문)
//			System.out.println("예외발생");
//		}
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("0으로 나눌 수 없거나 숫자로 변환할 수 없음");
		
//		catch(ArithmeticException e) {
//			System.out.println("숫자는 0으로 나눌 수 없습니다.");
//			//System.out.println("프로그램 종료");
//		}catch(NumberFormatException e) {
//			System.out.println("숫자로 변환할 수 없음");
		}catch(Exception E) { //모든 예외의 부모
			System.out.println("예외발생");
		}
		finally{
			System.out.println("프로그램 종료");
		}
	}
}
