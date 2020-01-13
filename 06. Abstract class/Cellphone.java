package abstractex;

//추상 클래스 Cellphone
/*
 추상 클래스
 상속을 하기 위하여 만든 클래스. 구체적이지 않고 설계 과정에서의 클래스.
 추상 클래스는 모든 메서드가 구현되어 있지 않다. 따라서 추상 클래스는 인스턴스로 생성될 수 없다.
 구현된 메서드는 하위 클래스에서도 공유될 메서드이다.
 구현하지 않은 추상 메서드는 하위 클래스가 어떤 클래스냐에 따라서 바뀌는 메서드이다. 즉 실제로 어떻게 사용되느냐가 하위 클래스에서 정의될 메서드를 추상 메서드로 사용한다.
 */
public abstract class Cellphone {
	String name;
	double claimAmount;
	public abstract void WIFIconnect(); //추상 메서드. 하위 클래스의 종류에 따라서 메서드의 기능이 달라진다.
	public abstract void useInternet();	//추상 메서드는 함수의 선언부를 정의한다.

	
	//구현된 메서드. 하위 클래스에서도 공통으로 사용된다.
	public void call() {
		System.out.println(name+"이 전화를 겁니다. 통화요금으로 100원이 부가됩니다.");
		claimAmount+=100;
	}
	public void message() {
		System.out.println(name+"이 메시지를 전송합니다. 문자요금으로 50원이 부가됩니다.");
		claimAmount+=50;
	}
	public void claim() {
		System.out.println("총 요금은 "+claimAmount+"원 입니다");
	}
	
	/*
	 템플릿 메서드
	 템플릿 메서드는 로직 흐름을 정의하는 역할이다. 이 흐름은 모든 하위 클래스가 공통으로 사용하고 코드를 변경하기 안 되기 때문에 주로 final로 선언한다.
	 예를 들어 통화와 문자를 남기고 인터넷에 접속한 후 요금을 청구받는 과정은 휴대폰의 종류와 상관없이 동일한 과정이다. 이러한 흐름을 템플릿 메서드로 정의한다.	 	 
	 */
	final void usePhone() {
		if(this instanceof Smartphone) {
			this.name="Smartphone";
		}
		else if(this instanceof Flipphone) {
			this.name="Flipphone";
		}	
		call();
		message();		
		useInternet();
		WIFIconnect();
		useInternet();
		claim();		
	}
	
	public static void main(String[] args) {
		//Cellphone p = new Cellphone(); 추상 클래스는 인스턴스로 생성 불가능
		Cellphone p1 = new Flipphone();
		Cellphone p2 = new Smartphone();
		p1.usePhone();
		p2.usePhone();
	}

}
