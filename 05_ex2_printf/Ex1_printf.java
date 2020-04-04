package ex2_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		//printf() : 화면에 데이터를 출력할 때 특정 포멧에 맞게 결과를
		//출력하고자 하는 용도로 사용하는 기능
		
		//10 + 2 = 12
		int n1 = 10;
		int n2 = 2;
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.printf("%d + %d = %d\n", n1, n2, n1+n2 );
		
		//10 * 2 = 20
		System.out.printf("%d * %d = %d\n", 10, 2, 20);
		
		
		//21세인 저는 A형 입니다
		System.out.printf("%d세인 저는 %c형 입니다\n", 21, 'A');
		
		
		//저는 홍길동이고 B형의 남자입니다
		String name = "홍길동";
		char blood = 'B';
		String gender = "남자";
		
		System.out.printf(
				"저는 %s이고 %c형의 %s입니다\n", name, blood, gender);
		
		//오늘 날씨는 '맑음'이며 기온은 17.5도 입니다
		String wed = "맑음";
		float temp = 17.5f; 
		System.out.printf(
				"오늘 날씨는 '%s'이며 기온은 %f도 입니다\n", wed, temp);
		
		//2020/03/27
		System.out.printf("%d/%02d/%02d\n", 2020, 3, 7);
		
		//오늘의 기온은 19.5도 입니다
		System.out.printf("오늘의 기온은 %.1f도 입니다\n", 19.5);
		
		//formatter의 타입
		//%d : 정수타입
		//%c : 문자타입
		//%f : 실수타입
		//%s : 문자열 타입
		
	}//main
}
















