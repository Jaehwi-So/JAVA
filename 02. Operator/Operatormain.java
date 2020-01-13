package java2;

public class Operatormain {
	
	public void operator(int number, int number2, double number3) {
		int sum;
		double sum2;
		boolean value;
		number++; //증가.감소 연산자
		number+=2; //복합 대입 연산자
		System.out.println(number);
		sum=number+number2; //대입 연산자, 산술 연산자
		System.out.println(sum);
		sum+=(int)number3; // 더 정밀한 자료형 -> 덜 정밀한 자료형에서의 형 변환
		System.out.println(sum);
		sum2=number+number2; // 덜 정밀한 자료형 -> 더 정밀한 자료형 : 묵시적 형 변환이 일어남
		System.out.println(sum2);
		value=(5>3)&&(5<7); // 논리 연산자, &&:논리곱, ||:논리합, !:부정
		System.out.println(value);	
		sum=number << 2; //비트 이동 연산자
		System.out.println(sum);
		sum=number2 >>> 2;
		System.out.println(sum);
		sum=number&number2;  //비트 연산자. (& : AND) (| : OR) (^ : XOR) (~ : NOT)
		System.out.println(sum);

	}
	public static void main(String[] args) {
		Operatormain f = new Operatormain();
		f.operator(3, 4, 1.6);
		
	}

}
