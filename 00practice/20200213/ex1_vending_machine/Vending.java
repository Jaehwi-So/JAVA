package vending_machine;

public class Vending {
	
	//private을 이용하여 직접 캔이나 잔액에 접근할 수 없게 하였다.
	private Can[] cans = new Can[5];	//자판기의 음료수 목록.
	private int money;	
	
	//1. 자판기에 음료수를 초기화하는 메서드
	public void init_vending() {
		for(int i = 0; i < cans.length; i++) {
			cans[i] = new Can();
		}
		//can[0].canName : private으로 설정하여 접근안됨
		cans[0].setCanName("fanta");
		cans[0].setPrice(1000);
		
		cans[1].setCanName("cider");
		cans[1].setPrice(1100);
		
		cans[2].setCanName("orange juice");
		cans[2].setPrice(1200);
		
		cans[3].setCanName("coke");
		cans[3].setPrice(1300);
		
		cans[4].setCanName("energy drink");
		cans[4].setPrice(1400);

	}
	//2. 사용자가 투입한 돈의 범위에서 먹을 수 있는 음료의 목록 출력
	public void show_cans(int m) {
		this.money = m;
		for(int i = 0; i < cans.length; i++) {
			if(cans[i].getPrice() <= this.money) {
				System.out.printf("%s = %d원\n",cans[i].getCanName(), cans[i].getPrice());
			}
		}
	}
	
	//3. 사용자가 선택한 음료를 제공하고 잔액을 돌려주는 메서드
	public int sell_can(String name) {
		for(int i = 0; i < cans.length; i++) {
			if(cans[i].getCanName().equals(name)) {
				System.out.printf("%s을 선택하셨습니다.",cans[i].getCanName());
				money -= cans[i].getPrice();
				return money;
			}
		}

		System.out.printf("구매 실패\n");
		return money;
	}
}
