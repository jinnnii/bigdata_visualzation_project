package ff;

public class MyException extends Exception{
	MyException(){}
	MyException(String s){
		super(s);
	}
}

class MyRTException extends RuntimeException{
	MyRTException(){}
	MyRTException(String s){
		super(s);
	}
}