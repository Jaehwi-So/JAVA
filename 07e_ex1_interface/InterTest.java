package ex1_interface;

//인터페이스는 서비스 요청에 따른 중계자 역할을 한다.
public interface InterTest {
	//인터페이스는 상수와 추상 메서드만 가질 수 있다. 이외에 일반적인 메서드나 일반적인 변수는 담을 수 없다.
	
	final int VALUE = 100;	//상수는 대문자로 작성하는 것이 약속
	abstract int getValue();	//추상 메서드

}
