package aa;

public class GenericMethod {
	public <T> T method1(T t) {
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		//System.out.println(t1.charAt());
		return t1.equals(t2);
	}
	public  <K,V> void method3(K k, V v) {
		System.out.println(k+": "+v);
		//System.out.println(k.length()); -> 오브젝트형 클래스에 있는 메소드만 넣을 수 있음
	}
}
