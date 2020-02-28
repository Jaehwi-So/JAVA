package ex1_generic;

//Generic 프로그래밍이란 일반적인 코드를 작성하되 이 코드를 다양한 타입의 객체에 대하여 재사용이 가능하도록 하는 객체지향 기법
//원하는 타입의 클래스를 받아서 사용 가능하다. 타입은 <>의 매개변수를 통해 전해진다.
public class GenericTest<T> {
	T value;
	
	public void setValue(T val) {
		this.value = val;
	}
	
	public T getValue() {
		return value;
	}
	
}
