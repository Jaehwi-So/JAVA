package vending_machine;

import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {
		
		Vending ven = new Vending();
		ven.init_vending(); //음료 초기화
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 투입하세요");
		ven.show_cans(sc.nextInt());
		
		System.out.println("음료를 선택하세요");
		int m = ven.sell_can(sc.next());
		System.out.println("잔액 : "+m);
	}
}
