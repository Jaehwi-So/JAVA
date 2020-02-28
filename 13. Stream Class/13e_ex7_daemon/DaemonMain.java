package ex2_daemon;

public class DaemonMain {
	public static void main(String[] args) {
		DaemonTest dt = new DaemonTest();
		Thread t = new Thread(dt);
		//t라는 스레드가 Daemon임을 명시한다. 메인스레드가 종료될 때 함께 종료된다.
		//데몬 스레드는 일반 스레드의 작업을 돕는 보조적인 역할의 스레드.
		t.setDaemon(true);
		t.start();
		for(int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("게임 중.."+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그렘 종료");
	}
}
