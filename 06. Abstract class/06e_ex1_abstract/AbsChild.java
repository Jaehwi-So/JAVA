package ex3_abstract;

public class AbsChild extends AbsParent{

	//추상클래스를 상속받은 자식클래스는 부모인 추상클래스가 가지고 있는 추상메서드를 반드시 오버라이딩 하여 가지고 있어야 한다.
	@Override
	public void setValue(int n) {
		System.out.println("n : " + n);
	}

	//추상메서드가 아닌 일반메서드는 강제로 넘겨받을 필요 없이 원할때 가져다 사용하면 된다.
	@Override
	public int getValue() {
		return super.getValue();
	}
	
}










