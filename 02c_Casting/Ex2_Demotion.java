package ex3_casting;

public class Ex2_Demotion {	
	public static void main(String[] args) {	
		
		char c = 'A';	//2byte
		System.out.println("c : "+c);
		int n = c + 1;	//4byte
		
		//#디모션 캐스팅(다운캐스팅) : 작은 자료형에 큰 자료형이 대입되는 것. 자동 형변환이 이루어지지 않는다. 반드시 자료형을 명시해야한다.
		c = (char)n;	//int > char
		System.out.println("c : "+c);
		
		float f = 5.5f;
		int num = 0;
		
		num = (int)f;	//float > int
		System.out.println("num : "+num);
		
	}
}
