package ex2_value_type;

public class Ex1_valueType {
	//=======기본 자료형=======
	/*
	 #자료형
	 논리형 : boolean(1bit)
	 문자형 : char(2byte)
	 정수형 : byte(1byte) -128~127
		   short(2byte) -32768~32767
		   int(4byte) -21억~2147483647
		   long(8byte) -900경~+900경
	 실수형 : float(4.x byte) 
		   double(8.x byte)
		   
	#변수 : 특정 값을 저장하기 위한 메모리 영역(공간)의 별칭
	-변수 선언 규칙 : 자료형 변수명; (선언), 변수명 = 값; (대입) 자료형 변수명 = 값; (초기화(선언+대입))
	-변수 선언 시 주의사항 : 변수를 만들 때는 _를 제외하고 특수문자 사용하지 않는다.
					  예약어(if, switch..)사용 금지
					  한글사용 금지
						  
	 */
	public static void main(String[] args) {
		//#논리형 : true, false(참, 거짓)만을 저장하는 자료형
		boolean b;
		//b = 1; <-저장을 위한 값이 자료형과 타입이 맞지 않으면 오류
		b = false;
		System.out.println("b="+b);
		
		//#문자형 : 홑따옴표('')안에 한글자 단위의 문자를 저장할 수 있는 자료형
		char ch = 'A';
		System.out.println("ch="+ch);
		ch = 'D';
		System.out.println("ch="+ch);
		
		ch = 65 + 1;	//65 = 아스키 코드 : 'A'
		System.out.println("ch="+ch);
	}//main

}
