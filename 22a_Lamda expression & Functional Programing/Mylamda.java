package lamdaxx;
//함수형 프로그래밍(Functional Programing)
/*
 자바는 객체를 기반으로 프로그램을 구현한다. 어떠한 기능을 구현하려면 클래스를 먼저 만든 후 그 기능을 구현한 메서드를 호출해야 한다.
 이와 반대로 함수의 구현과 호출로만으로 프로그램을 만들 수 있는 프로그래밍 방식이 있다.
 이를 자바에서 제공하는 함수형 프로그래밍 방식을 람다식(Lamda expression)이라고 한다.
*/
public class Mylamda {
	
	public static void showMyString(StringConcat s) { //매개변수로 전달된 람다식
		s.makeString("bbb","ccc");
	}
	
	public static StringConcat returnString() {
		return (s1, s2) ->System.out.println(s2+","+s1);
	}
	
	public static void main(String[] args) {
		//람다식 형식 :  (매개변수, 매개변수, ... 매개변수) -> {함수 몸통};
		Number max = (x,y) -> x>=y ? x:y; //람다식은 메서드 이름이 없고 메서드를 실행하는 데 필요한 매개변수와 매개변수를 활용한 실행 코드를 구현한 것이다.
		//다음의 람다식은 인터페이스 Number의 getMax의 몸체 부분을 구현한 것이다.
		System.out.println(max.getMax(10, 20));
		
		//다음의 경우도 인터페이스 str의 makeString을 람다식으로 구현
		StringConcat str = (s1,s2) -> System.out.println(s1+","+s2); //람다식 str은 String들을 차례로 이어줌
		StringConcat str2 = returnString(); //람다식 str2는 String들을 반대로 이어줌. returnString()은 람다식을 반환해줌.
		str.makeString("aaa","bbb");
		str2.makeString("aaa","bbb");
		
		//람다식은 객체 없이 인터페이스 구현만으로 메서드를 호출할 수 있다.
		//->람다식으로 메서드를 구현해서 호출하면 컴퓨터 내부에서 익명 클래스가 생성되고 이를 통해 익명 객체를 생성하여 메서드를 호출하는 원리이다.
		
		showMyString(str); //람다식을 매개변수로 전달할 수도 있다. 이 때 전달되는 매개변수의 자료형은 인터페이스형이다.
		showMyString(str2);
	}

}
