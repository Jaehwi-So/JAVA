package ex2_inheritence;

public class Snake extends Animal{
	String poison = "독";
	
	//메서드의 오버라이딩. 메서드의 재정의를 의미하며 상속관계의 객체에서 부모의 메서드를 자식이 가져와 자신의 사정에 맞게 재정의 하는 것.
	@Override
	public int getLeg() {
		return 0;
	}
}
