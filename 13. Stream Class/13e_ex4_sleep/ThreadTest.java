package ex4_sleep;

public class ThreadTest extends Thread{

	private int num;
	
	public ThreadTest(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		
		for( int i = num; i >= 0; i-- ) {
			
			try {
				Thread.sleep(1000);
				
				System.out.println(i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//for
		
	}
	
}

















