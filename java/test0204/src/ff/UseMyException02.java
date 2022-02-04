package ff;

public class UseMyException02 {
	void abc_1(int num) throws MyException {
		if (num >= 70)
			System.out.println("정상동작");
		else
			throw new MyException("MyException2");

	}

	void bcd_2() {
		try {
			abc_1(60);
		} catch (MyException e) {
			System.out.println("예외처리");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}