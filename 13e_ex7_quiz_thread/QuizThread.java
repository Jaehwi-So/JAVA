package ex3_work;

public class QuizThread implements Runnable{
	int count = 0;
	boolean clear = false;
	
	@Override
	public void run() {
		while(clear != true) {
			try {
				count++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("걸린 시간 : "+count);
	}

}