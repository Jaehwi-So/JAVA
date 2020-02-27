package interfacexx;
/*
인터페이스
인터페이스의 역할은 프로그램에서 어떤 메서드를 제공하는지 알려주는 명세표의 역할와 동시에 약속의 역할을 한다.
인터페이스를 통하여 해당 프로그램이 어떤 역할을 하는지 판단할 수 있으며 확장성을 넓히는 역할을 한다. 실무에서 인터페이스의 역할은 중요하다.  
 */
public class Interfacemain {
	
	public static void main(String[] args) {
		Customer c1 = new Customer("홍길동",0111110);
		Buyer b1 = c1;
		b1.buy();		
		b1.order();
		b1.chargs();	//디폴트 메서드 chargs()
		//b1.quit();
		Seller s1 = c1; //Customer형은 Buyer형이자 Seller형이다.
		s1.sell();
		s1.order();
		s1.quit();
		//s1.buy();
		if(s1 instanceof Customer) { // s1의 원래 형이었던 Customer의 함수를 사용하려고 다운캐스팅하여 buy()와 sell()둘 다 사용 가능
			Customer c2 = (Customer)s1;
			c2.buy();
			c2.sell();
			c2.quit();
		}
	}

}
