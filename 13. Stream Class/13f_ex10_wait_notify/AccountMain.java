package ex5_wait_notify;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		
		Account acc = new Account();
		AccountThread r = new AccountThread(acc);
		Thread t = new Thread(r);
		t.start();
		
		//위의 출금스레드와는 별개로 값을 입금하는 용도로 사용하기 위한 반복문
		while(true) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			acc.money_deposit(n);
		}
	}
}