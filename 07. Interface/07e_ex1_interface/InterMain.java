package ex1_interface;

public class InterMain {
	public static void main(String[] args) {
		//자식과 부모 인터페이스는 주소값이 같다.
		InterChild ic = new InterChild();
		System.out.println(ic.getValue());
		
	}
}
