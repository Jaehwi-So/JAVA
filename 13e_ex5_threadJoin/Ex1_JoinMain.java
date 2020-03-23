package ex_0224;

public class Ex1_JoinMain {
	
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!!");
		Ex1_Threadjoin r = new Ex1_Threadjoin();
		Thread mThread = new Thread(r);
		mThread.start();
		
		try {
			//해당 스레드의 run()메서드가 완전히 작업을 마무리할 때 까지 메인스레드에서 응답을 기다리게 하는 메서드.
			mThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인스레드 종료");
	}
}