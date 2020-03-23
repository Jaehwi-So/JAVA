package ex1_singleThread;

public class ThreadTest extends Thread{
	//스레드 : 백그라운드에서 동작하는 독립적인 실행단위
	//인터넷을 하면서 음악을 듣는것 처럼 한 번에 두개 이상의 프로세스를 
	//실행 가능하게 해 준다(멀티 태스킹)
	@Override
	public void run() {
		//프로세스의 독립적인 수행을 위한 영역
		for( int i = 0; i < 10; i++ ) {
			System.out.println("스레드 실행중");
		}//for
	}
}
























































