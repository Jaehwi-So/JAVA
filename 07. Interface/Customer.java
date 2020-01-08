package interfacexx;

//인터페이스를 통해서 다음과 같이 다중 상속과 비슷한 역할을 할 수 있다. 클래스 Customer은 Buyer과 Seller 두 인터페이스를 구현하였다.
//인터페이스는 추상 클래스와 달리 구현 코드나 멤버 변수를 가지지 않기 때문에 여러 개를 동시에 구현할 수 있다. 이를 통해 다중 상속과 비슷한 기능을 할 수 있다.
//다음 Customer처럼 Member을 상속받으면서 Buyer과 Seller의 인터페이스를 구현하는 것을 동시에 할 수 있다.
public class Customer extends Member implements Buyer, Seller {
	
	Customer(String s, int n){
		super(s,n); //하위 클래스에서 상위 클래스 접근 생성자
	}
	
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	@Override
	public void order() {
		System.out.println("구매 혹은 판매 요청");
	}
	
	@Override
	public void quit() {
		System.out.println("벼룩시장 시스템 중단");
	}

}
