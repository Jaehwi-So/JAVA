package ex_0224;

public class Ex1_Threadjoin implements Runnable{

	@Override
	public void run() {
		for( int i = 0; i < 10; i++ ) {			
			System.out.println("스레드.." + i);			
		}//for		
	}
}
