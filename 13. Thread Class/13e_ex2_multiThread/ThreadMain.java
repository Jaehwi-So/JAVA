package ex2_multiThread;

public class ThreadMain {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		//스레드는 독립적인 수행단위지만, 동시다발적으로 실행되는 것이 아니라 번갈아 가면서 실행된다.
		t1.start();
		t2.start();
		t3.start();
		
		System.out.print("main종료");
		
	}//main
}

















































