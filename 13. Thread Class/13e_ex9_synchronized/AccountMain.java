package ex4_synchronized;

public class AccountMain {
	public static void main(String[] args) {
		ATM r = new ATM();
		Thread mom = new Thread(r, "엄마");	//스레드의 이름을 지어줄 수 있다.
		Thread son = new Thread(r, "아들");
		
		mom.start();
		son.start();
	}
}
