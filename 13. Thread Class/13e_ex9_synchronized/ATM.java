package ex4_synchronized;

public class ATM implements Runnable{
	//동기화 : 두 개 이상의 스레드가 하나의 자원을 공유할 경우 동기화 문제가 발생할 수 있다. 변수는 하나인데, 여러개의 스레드가 한 변수값을 변경할 경우
	//오류가 발생할 수 있기 때문이다. 특정 스레드들이 공유하는 하나의 자원을 사용중일 때, 현재 자원을 사용중이지 않은 다른 스레드가 일시적으로 작업을
	//중단하도록 만드는 기술
	int money = 10000;
	
	public void withDraw(int outMoney) {
		//현재 동작중인 스레드의 이름을 가져오는 메서드
		String threadName = Thread.currentThread().getName();
		if(money > 0) {
			money -= outMoney;
			System.out.println(threadName+"의 잔액 :"+money);
		}
		else {
			System.out.println(threadName+" 잔액 부족 ");
		}
	}
	@Override
	public void run() {
		
		//동기화를 시켜주는 메서드 synchronized
		//동기화 영역이 마무리 될 때 까지는 다른 스레드에서는 접근할 수 없다.
		synchronized (ATM.class) {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					withDraw(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}