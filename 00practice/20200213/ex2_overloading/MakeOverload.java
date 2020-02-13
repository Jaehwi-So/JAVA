package ex2_overloading;

/*
#메서드의 오버로딩
오버로딩은 메서드의 '중복정의'라고 하며 하나의 클래스에서 같은 이름을 가진 메서드가 여러개 정의되는 것을 의미한다.

오버로딩 메서드를 만드는 규칙
1) 메서드의 이름은 대소문자를 비롯하여 반드시 같아야 한다.
2) Parameter가 달라야 한다.
3) Parameter의 순서가 다르다면 오버로딩으로 인정된다.
*/

public class MakeOverload {
	
	public void getResult() {
		System.out.println("인자가 없는 메서드");
	}
	
	//오버로딩
	public void getResult(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	//오버로딩
	public void getResult(char c) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	//오버로딩
	public void getResult(String s) {
		System.out.println("문자열을 인자로 받는 메서드");
	}
	
	//오버로딩
	public void getResult(int n, String s) {
		System.out.println("정수, 문자열을 인자로 받는 메서드");
	}
	
	//오버로딩
	public void getResult(String s, int n) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}
	
}
