package ex5_wait_notify;

public class Account {
	int balance = 1000; //잔액
	
	//출금 메서드
	//동기화 메서드 키워드 synchronized를 넣어준다.
	public synchronized void money_withdraw(int money) {
		if(balance < money) {
			try {
				wait(); //wait() : 구동중인 스레드를 일시적으로 정지시키는 메서드. notify()가 호출될 때 까지 무한정 대기상태.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance -= money;
	}
	
	//입금 메서드
	public synchronized void money_deposit(int money) {
		balance += money;
		notify(); //정지된 스레드를 재실행한다.
	}
	
}
