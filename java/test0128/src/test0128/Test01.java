package test0128;

public class Test01 {
	public static void main(String[] args) {
		//Animal animal = new Animal(); error! 객체 생성 안됨
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.cry();
		cat.cry();
	}
}
