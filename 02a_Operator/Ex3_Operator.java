package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		//비트 연산자 : 논리연산자와 유사하지만  bit단위(2진수)의 연산을 수행한다. 일반적으로 시프트연산자와 더불어 암호화, 복호화 작업에 사용한다.
		int a = 10; //1010
		int b = 7;  //0111
		int c;
		c = a & b;	//0010	//논리곱(and)
		System.out.println("a&b : "+c);
		c = a | b;	//1111	//논리합(and)
		System.out.println("a|b : "+c);
		
		//시프트 연산자 : bit단위(2진수)의 연산을 수행. 오른쪽 또는 왼쪽으로 비트를 이동하여 값을 변화시키는 연산자.
		int n1 = 12; //1100
		int n2 = n1 >> 2; //0011 // >>n :n비트씩 오른쪽으로 이동
		System.out.println("n1 >> 2 : "+n2);
		
		char ch ='F'; //01000110
		n2 = ch >> 1; //00100011
		System.out.println("ch >> 1 : "+ n2);
		
	}

}
