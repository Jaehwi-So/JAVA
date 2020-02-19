package interfacexx;

public interface Seller {
	void sell();
	//디폴트 메서드 : 디폴트 메서드는 인터페이스를 구현한 여러개의 클래스가 해당 메서드를 같은 용도로 사용할 수 있다. 이 때 인터페이스에 디폴트 메서드를 정의해두면 공통된 메서드를 사용할 수 있다.
	//디폴트 메서드를 정의해 두면 인터페이스를 사용하는 클래스에서 재정의를 하지 않아도 된다.
	default void order() {
		System.out.println("판매 승인 요청");
	}
	
	//다음 디폴트 메서드를 해당 인터페이스를 구현한 클래스에서 재정의 할 수 있다.
	default void quit() {
		System.out.println("판매 종료");
	}

}
