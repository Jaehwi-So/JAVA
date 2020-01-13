package abstractex;
//하위 클래스 Cellphone
public class Flipphone extends Cellphone {
	String name = "Flipphone";
	
	@Override //추상 메서드 재정의
	public void WIFIconnect() {
		System.out.println(name+"은 WIFI에 연결할 수 없습니다");		
	}
	@Override //추상 메서드 재정의
	public void useInternet() {
		System.out.println(name+"이 요금제 500원을 사용하여 인터넷에 접속합니다.");		
		claimAmount+=500;
	}

}
