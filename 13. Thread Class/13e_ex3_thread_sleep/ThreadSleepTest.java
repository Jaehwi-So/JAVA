package ex3_thread_sleep;

public class ThreadSleepTest extends Thread{

	@Override
	public void run() {
		
		for( int i = 0; i < 15; i++ ) {
			
			System.out.println("스레드 실행 중..." + i);
			
			try {
				
				Thread.sleep(1000);//1초 대기
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//for
		
	}
	
}







