package ex1_super;

public class Child extends Parent{

	@Override
	public void getResult(int n1, int n2) {
		//super.getResult(n1, n2); <-- 부모 클래스의 메서드 호출
		System.out.println("자식");
	}
	
	public Child() {	
		//super는 부모클래스 의미
		//super() : 부모클래스 생성자
		//super.메서드() : 부모클래스 메서드
		super(10);//Parent();
		System.out.println("자식클래스 생성자");
	}
	
}











