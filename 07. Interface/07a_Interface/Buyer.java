package interfacexx;
//인터페이스에는 추상 클래스와는 달리 추상 메서드와 상수로만 이루어 질 수 있다.
public interface Buyer {
	//int num; // 변수는 선언 불가능
	int ERROR = -9999; // 상수로 선언 가능
	void buy();
	//디폴트 메서드 : 디폴트 메서드는 인터페이스를 구현한 여러개의 클래스가 해당 메서드를 같은 용도로 사용할 수 있다. 이 때 인터페이스에 디폴트 메서드를 정의해두면 공통된 메서드를 사용할 수 있다.
	//디폴트 메서드를 정의해 두면 인터페이스를 사용하는 클래스에서 재정의를 하지 않아도 된다.
	default void chargs() {
		System.out.println("입금 승인 요청");
	}
	
	default void order() {
		System.out.println("구매 승인 요청");
	}

}
