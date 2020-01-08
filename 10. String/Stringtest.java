package stringxx;

public class Stringtest {
	
	public static void main(String[] args) {
		//String 선언의 두가지 방법. String은 class이다.
		String str1 = "aaa";	//문자열 상수를 가리키는 방식
		String strv1 = "aaa";   
		String str2 = new String("bbb"); //String 클래스의 생성자의 매개변수를 이용하여 문자열 생성
		String strv2 = new String("bbb");
		
		//문자열의 내용을 비교할 때에는 주로 str==equals(str)이용
		System.out.println(str1==strv1);//다음 방식은 문자열 상수를 가리키므로 str1과 strv1은 같은 상수 풀을 가리키게 된다
		System.out.println(str1.equals(strv1));//문자열 내용도 같으므로 true반환(문자열의 toString()재정의로 주소값이 아닌 문자열 내용이 나온다)
		System.out.println(str2==strv2);//다음 방식은 인스턴스가 매번 새로 생성되므로 str2와 strv2의 주소값이 다르다.
		System.out.println(str2.equals(strv2)); //문자열 내용은 같으므로 true반환
		
		//str.concat(str) : 두 개의 문자열을 연결해줌
		System.out.println("처음 str2의 주소 "+str2.hashCode());
		str2=str2.concat(str1);	//이 때 str2는 기존 가리키는 주소의 문자열에서 str1만 추가하는 것이 아닌 새로운 문자열의 주소를 가리키게 된다. 
		System.out.println(str2);
		System.out.println("연결 후 str2의 주소 "+str2.hashCode());
		
		//StringBuffer과 StringBuilder ; 문자열을 변경하거나 연결해야 할 때가 많다. 이 때의 메모리 낭비를 막기 위해서 사용
		String str3 = "ccc";
		String str4 = "ddd";
		System.out.println("처음 str3의 주소 "+str3.hashCode());
		StringBuilder buffer = new StringBuilder(str3);	//String으로부터 StringBuffer생성
		buffer.append(str4);	//StringBuilder과 Buffer은 여러개의 문자열을 연결해야 할 때 주로 사용한다.
		buffer.append("eee");
		System.out.println("연결 후 str3의 주소 "+str3.hashCode());
		System.out.println(str3);	//아직 str3 문자열 그대로인것을 확인.
		
		str3=buffer.toString(); //문자열 변경 후에 buffer에서 toString()매서드를 호출하면 String 클래스로 다시 변환
		System.out.println(str3);
	
	}

}
