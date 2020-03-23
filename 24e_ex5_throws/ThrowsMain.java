package ex1_throws;

public class ThrowsMain {
	public static void main(String[] args) {
		
		Throws1 t1 = new Throws1();
		Throws2 t2 = new Throws2();
		
		//throws를 위임받은 클래스에서는
		//try-catch구문을 사용하여 해당 예외를 처리해줘야 한다.
		try {
			t1.mySleep();
			t2.mySleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}
