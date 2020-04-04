package ex3_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		//str.length() : 문자열의 길이
		String str = "Hong Gil Dong";
		int len = str.length();
		System.out.println( "str의 길이 : " + len );
		
		//str.indexOf(ch) : 문자열에서 해당 문자의 첫번째 위치
		int index = str.indexOf('o');
		System.out.println("첫번째 o의위치: " + index);
		
		//str.indexOf(ch, n) : 문자열에서 해당 문자의 n번째 위치
		index = str.indexOf('o', 2);
		System.out.println("두번째 o의위치: " + index);
		
		//str.indexOf(str) : 문자열해서 해당 문자열의 위치
		index = str.indexOf("Gil");
		System.out.println("gil의 위치: " + index);
		
		//str.lastIndexOf(char) : 문자열에서 해당 문자의 마지막 위치
		index = str.lastIndexOf('o');
		System.out.println("마지막 o의 위치: " + index);
		
		//str.charAt(n) : 문자열에서 n번째 단어
		char res = str.charAt(6);
		System.out.println("6번째 단어 : " + res);
		
		//str.equals(s) : str과 s가 같은지 비교
		String fruit = "apple";
		if( fruit.equals("apple") ) {
			System.out.println("equals");
		}
		//str.equalsIgnoreCase(s) : str과 s가 대소문자를 무시하고 같은지 비교
		fruit = "Apple";
		if( fruit.equalsIgnoreCase("apple") ) {
			System.out.println("equals ignorecase");
		}
		
		//trim() : 공백제거
		String name = "  홍길동  ";
		String name2 = name.trim();
		System.out.println(name.length());
		if(name2.contentEquals("홍길동")) {
			System.out.println("값이 같습니다");
		}
		
		//substring() : 문장 잘라내기
		String str2 = str.substring(2, 7);
		System.out.println("잘라낸 문장 : "+str2);
		
		//Integer
		String number = "10";
		//정수형태의 문자열을 실제 정수로 바꾸어주는 Integer.parseInt()
		int n = Integer.parseInt(number);
		System.out.println(n + 10);
		float f = Float.parseFloat("10.5");
		System.out.println(12.3 + f);
		
		/* #Wrapper class
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 * boolean -> Boolean
		 * char -> Character
		 */
	}
}
















































