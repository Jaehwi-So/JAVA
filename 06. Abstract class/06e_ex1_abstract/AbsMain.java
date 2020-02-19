package ex3_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		//추상클래스는 인스턴스를 직접적으로 가질 수 없다.
		//AbsParent a1 = new AbsParent();
		
		//추상 클래스는 자신의 미완성된 기능을 자식이 완성시키도록 조건부 상속하여 자식클래스가 객체화 될 때 함께 생성된다.
		AbsChild c = new AbsChild();
		c.setValue(10);
		System.out.println(c.getValue());
	}
}











