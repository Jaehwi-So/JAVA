package ex4_single_for_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//키보드에서 정수 n에 값을 입력 받는다
		//1부터 입력받은 n까지의 합을 계산하여 결과를 출력.
		//( 예를들어 키보드에서 5를 입력 받았다면 1 + 2 + 3 + 4 + 5의 결과인
		//15가 출력되면 된다.)
		
		//정수 : 4
		//결과 : 10
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		int res = 0;//최종결과를 출력하기 위한 변수
		
		for( int i = 1; i <= n; i++ ) {
			res += i;
		}//for
		
		System.out.println("결과 : " + res);
		
	}//main
}










