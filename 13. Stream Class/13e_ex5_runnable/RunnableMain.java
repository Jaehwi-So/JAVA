package ex5_runnable;

public class RunnableMain {
	public static void main(String[] args) {
		
		RunnableTest t = new RunnableTest();
		Thread t2 = new Thread( t );
		t2.start();
		
	}//main
}
