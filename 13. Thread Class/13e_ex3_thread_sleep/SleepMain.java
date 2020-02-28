package ex3_thread_sleep;

public class SleepMain {
	public static void main(String[] args) {
		
		ThreadSleepTest t = new ThreadSleepTest();
		t.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("메인스레드 종료");
		
	}//main
}
