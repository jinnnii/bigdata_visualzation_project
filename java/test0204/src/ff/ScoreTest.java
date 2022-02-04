package ff;
class A{
	void checkScore(int score) throws MinusException, OverException{
		if (score<0) {
			throw new MinusException("예외, 음수값 입력");
		}else if (score>100) {
			throw new OverException("예외, 100점 초과");
		}else System.out.println("정상적인 값입니다.");
	}
}
public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		try {
			a.checkScore(85);
			a.checkScore(150);
		}catch(MinusException|OverException e) {
			System.out.println(e.getMessage());
		}
	}

}
