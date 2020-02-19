package ex4_static;

public class TestStatic {
	//static : static으로 선언한 변수나 메서드는 객체가 아무리 많이 생성되어도 메모리상에 반드시 한 개만 만들어진다.
	int n;
	static String str;
	
	public void test() {
		n = 100;		
		//static 변수는 일반 메서드에서 언제든지 호출하여 사용 가능하다.
		str = "abc";
	}
	
	//static 메서드
	public static void test2() {
		//n = 100;  //메서드가 static인 경우 이 메서드 안에서는 일반 멤버변수를 사용할 수 없다.
		str = "abc";
		
		int num = 100;
		//static int num2 = 200; //static 변수를 직접 선언할 수 없다.
	}
	

}
