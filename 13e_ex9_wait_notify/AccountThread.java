package ex5_wait_notify;

import java.util.Random;

public class AccountThread implements Runnable{

	Account acc;
	
	public AccountThread(Account acc) {
		this.acc = acc;
	}
	
	@Override

	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				//출금액을 100원 ~ 300원 사이의 난수로 지정
				int money = (new Random().nextInt(3)+1) * 100;
				acc.money_withdraw(money);
				System.out.println("잔액: "+acc.balance);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
