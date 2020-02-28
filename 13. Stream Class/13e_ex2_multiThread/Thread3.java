package ex2_multiThread;

public class Thread3 extends Thread{

	@Override
	public void run() {
		for( int i = 0; i < 100; i++ ) {
			System.out.print("3");
		}//for
	}
	
}
