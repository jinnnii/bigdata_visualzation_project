package ff;

public class MinusException extends Exception{
	MinusException(){}
	MinusException(String s){
		super(s);
	}
}

class OverException extends Exception{
	OverException(){}
	OverException(String s){
		super(s);
	}
}