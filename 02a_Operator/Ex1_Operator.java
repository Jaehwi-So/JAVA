package ex1_operator;

public class Ex1_Operator {	
	/*
	 #연산자(Operator)
	 1.최고연산자 : . ()
	 2.증감연산자 : ++ --
	 3.산술연산자 : + - * / %
	 4.시프트연산자 : << >>
	 5.비교연산자 : > < >= <= == !=
	 6.비트연산자 : & | ^ ~
	 7.논리연산자 : && || !
	 8.삼항연산자 : ? :
	 9.대입연산자 : = += -= *= /= %=
	 */
	
	public static void main(String[] args) {
		//산술 연산자 : 4칙연산과 나머지 연산자를 가지고 있다.
		int n1 = 20;
		int n2 = 7;
		int n3;
		n3 = n1 + n2;
		System.out.println("n1+n2="+n3); //단축키 : syso + 컨트롤스페이스바 : System.out.println()
		n3 = n1 - n2;
		System.out.println("n1-n2="+n3);
		n3 = n1 / n2;
		System.out.println("n1/n2="+n3);
		n3 = n1 % n2;
		System.out.println("n1%n2="+n3);
		
		//대입 연산자 : 특정 값을 변수에 전달하여 기억시키고자 할 때 사용하는 연산자.
		int i1 = 10;
		int i2 = 7;
		i1 += i2; // i1 = i1 + i2
		System.out.println("i1+=i2:"+i1);
		i1 /= i2;
		System.out.println("i1/=i2:"+i1);
		i2 %= i1;
		System.out.println("i2%=i1:"+i2);
		
	}
	
}
