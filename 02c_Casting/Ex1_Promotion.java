package ex3_casting;


public class Ex1_Promotion {
	//#캐스팅(형 변환) : 서로 다른 자료형 간에 값을 주고받는 것.

	public static void main(String[] args) {
		
		//#프로모션 캐스팅(업캐스팅) : 큰 자료형에 작은 자료형이 대입되는 것
		double d = 100.5;
		int n = 200;
		d = n;
		//int형 n이 double형으로 자동으로 형변환 되어  d에 대입된다.
		System.out.println("d : "+d);
		
		char c = 'A';	//2byte
		int num = 100;	//4byte
		num = c;
		System.out.println("num : "+num);	
	}
}

