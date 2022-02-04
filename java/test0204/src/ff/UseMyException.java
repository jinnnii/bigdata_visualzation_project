package ff;

public class UseMyException {

	void abc_1(int num) {
		try {
			if(num>=70)
				System.out.println("정상동작");
			else 
//				throw new MyException();
				throw new MyException("MyException1");
		}catch(MyException e) {
			System.out.println("예외처리");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	void bcd_1() {
		abc_1(30);
	}

}
