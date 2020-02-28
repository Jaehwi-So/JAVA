package ex1_singleThread;

public class ThreadMain {
	public static void main(String[] args) {
		
		ThreadTest tt = new ThreadTest();
		
		//스레드의 run()메서드를 백그라운드에서 동작하도록 하는 메서드
		tt.start();
		
		System.out.println("main스레드 종료");
		
	}//main
}
