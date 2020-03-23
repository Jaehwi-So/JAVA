package abstractex;

//하위 클래스 Smartphone

public class Smartphone extends Cellphone {
	String name = "Smartphone";
	public boolean wifiSwitch=false;

	@Override //추상 메서드 재정의
	public void WIFIconnect() {
		System.out.println(name+"이 WIFI에 연결합니다.");		
		wifiSwitch=true;
	}
	@Override //추상 메서드 재정의
	public void useInternet() {
		if(wifiSwitch==true) {
			System.out.println(name+"이 WI-FI를 사용하여 인터넷에 접속합니다.");					
		}
		else {
		System.out.println(name+"이 데이터 요금 100원을 사용하여 인터넷에 접속합니다.");		
		claimAmount+=100;
		}
	}

}
