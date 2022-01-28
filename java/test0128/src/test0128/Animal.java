package test0128;

public abstract class Animal {
	abstract void cry();
	// 추상클래스는 객체를만들 수 없다.

	public Animal() {
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}