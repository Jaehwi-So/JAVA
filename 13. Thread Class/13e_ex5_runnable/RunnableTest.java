package ex5_runnable;

public class RunnableTest implements Runnable{

	@Override
	public void run() {
		for( int i = 0; i < 10; i++ ) {
			
			try {
				Thread.sleep(500);
				System.out.println(i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//for
	}

}
