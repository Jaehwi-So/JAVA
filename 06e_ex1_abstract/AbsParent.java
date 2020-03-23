package ex3_abstract;

//추상클래스의 구성
//접근제한 abstract class 클래스명
//abstract 접근제한 class 클래스명
abstract public class AbsParent {
	//추상 메서드가 한 개 이상 정의되어 있는 클래스를 추상클래스라고 하는데 abstract 키워드를 사용하여 자신이 추상클래스임을 명시해줘야 한다.
	int value = 100;
	final int VALUE2 = 200;
	
	public int getValue() {
		return value;
	}
	
	/*추상메서드(메서드의 body가 없다. abstract키워드를 사용한다)
	 *abstract 접근제한 반환형 메서드명();
	 *접근제한 abstract 반환형 메서드명();
	 *추상메서드는 body가 없기 때문에 이를 '미완성적 개념'이라고 한다.
	 *이 '미완성의 개념'을 자식이 상속받아서 완성시키는 것이 하나의 조건이 된다.*/
	abstract public void setValue(int n);
}














