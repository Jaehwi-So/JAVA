package ex2_multiThread;

public class Thread1 extends Thread{

	@Override
	public void run() {
		
		for( int i = 0; i < 100; i++ ) {
			System.out.print("1");
		}//for
		
	}
	
}
