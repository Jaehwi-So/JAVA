package ex4_static;

public class BankMain {
	
	public static void main(String[] args) {
		Bank b1 = new Bank("부산","00-111-2222");
		b1.interest = 10.0f;	//static변수인 interest는 한 개만 만들어지기 때문에 모든 객체의 멤버변수값이 초기화된다.
		
		Bank b2 = new Bank("대구","11-222-3333");
		//b2.interest = 10.0f; interest는 static으로 선언. 이자율을 일일이 바꾸기에는 번거롭다.특정 은행의 이자율에 대한 전달이 잘 안되었다면 망한다.
		
		Bank b3 = new Bank("울산","22-333-4444");
		//b3.interest = 10.0f; 
		
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		
		Bank.interest = 5.0f;	//클래스명, 스태틱변수(메서드)로 메모리할당 없이 직접 접근이 가능하다.
		
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		
		/*
		 b1은 스택영역에 만들어짐. 힙영역에 객체 인스턴스가 생성. 인스턴스의 멤버 변수 중 static으로 선언된
		 interest는 static영역에 딱 하나만 만들어지며 변수를 사용할 때에는 static영역을 참조하여 사용한다.
		 */
	}

}
