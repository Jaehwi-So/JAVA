package ex1_throws;

public class Throws1 {

	//throws키워드를 통해 해당 메서드에서 발생하는 예외를
	//다른 클래스에서 try-catch로 잡아낼 수 있도록 위임할 수 있다.
	public void mySleep() throws InterruptedException {

		Thread.sleep(3000);

		System.out.println("Throws1 실행됨");

	}

}
