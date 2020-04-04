package ex1_operator;

public class Ex5_Operator {
	
	public static void main(String[] args) {
		//삼항(조건) 연산자 : 하나의 조건을 정의하여 그 조건이 참, 거짓인 경우 각각에 대해서 결과를 다르게 반환하는 연산자.
		int a = 10;
		int b = 15;
		boolean res = ++a >= b ? true : false;	// (조건식) ? a : b  => true일경우 a, false일 경우 b
		System.out.println("삼항 연산 : "+res);
		
		int age = 26;
		int limit = 25;
		char res2 = age > limit ? '합' : '불';
		System.out.println("삼항 연산 : "+res2);
		
		//Q
		a=10; b=12;
		//        a=11      9 12       1         a=23
		res2 = ++a >= b || a-2<=b && 13-b>=0 &&(a+=b)-(a%b)>10? 'O' : 'X';
		//         f        t          t         23     11  t      t  'O'
		System.out.println("Q : "+res2);

		
	}

}
