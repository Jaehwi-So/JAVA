package ex3_string;

public class Ex1_String {
	public static void main(String[] args) {
		
		//String클래스는 두가지 특징을 가지고 있다.
		//1) 객체 생성법이 두 가지(암시적, 명시적)
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다(불변적 특징)
		String s1 = "abc";//암시적
		String s2 = "abc";
		String s3 = new String("abc");//명시적
		String s4 = new String("abc");
		
		//==연산자는 객체간 비교에서는 주소를 비교하는 코드가 된다.
		if( s1 == s3 ) {
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		//String클래스는 주소를 비교하는 경우보다
		//값을 비교하는 경우가 훨~~~~~~~~~~~~씬 많으므로
		//equals()라는 기능을 사용하여 값을 비교하는 용도로 쓴다.
		if( s1.equals(s3) ) {
			System.out.println("s1과 s3는 값이 같습니다");
		}
		
		String str = "홍길동님 ";
		str += "안녕";
		System.out.println(str);
		
		
	}//main
}







































