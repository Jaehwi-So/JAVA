package ex1_interface;


public class InterChild implements InterTest{	//인터페이스를 구현하고 있는 클래스
	//인터페이스를 '구현'하려면 implements라는 예약어를 사용한다. extends로 '상속'받는것이 아니다.
	
	@Override
	public int getValue() {
		return VALUE;
	}
}
