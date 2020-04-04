package ex2_value_type;

public class Ex2_valueType {

	public static void main(String[] args) {
		//#정수형 : 정수값만 저장 가능한 자료형
		//byte b = 128; ->자료형의 허용범위 벗어남. 메모리 한도초과
		byte b = 127;
		//int n = 21000000000; ->자료형의 허용범위 벗어남. 메모리 한도초과
		
		int n = 2100000000;
		short s = 32767;
		
		//자바에서 정수의 디폴트값(기본값)은 int이다. 따라서 int의 범위를 넘어가는 수에는 자료형 명시를 해주어야 한다.
		long l = 2200000000L;
		System.out.println("n : "+n);
		System.out.println("l : "+l);
		
		//#실수형 : 소수점을 포함하는 값을 저장하기 위한 자료형
		
		float f = 100.5f;	//실수의 디폴트값은 double이다. 자료형을 명시.
		double d = 100.5;
		
		f = 100;
		d = 100;
		System.out.println("f : "+f);
		System.out.println("d : "+d);
	}
	
}
