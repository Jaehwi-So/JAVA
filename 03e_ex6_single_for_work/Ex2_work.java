package ex4_single_for_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		//키보드에서 정수 n1, n2를 각각 입력받는다.
		//n1 ~ n2까지의 합을 계산하여 출력
		//(예를들어 2와 5를 받았다면 2 + 3 + 4 + 5의 결과인 14가 출력)
		
		//수1 : 2
		//수2 : 5
		//결과 : 14
		
		//수1 : 5
		//수2 : 2
		//결과 : 14
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		
		int res = 0;
		
		if( su1 > su2 ) {
			int su3 = su1;
			su1 = su2;
			su2 = su3;
		}
		
		for( int i = su1; i <= su2; i++ ) {
			
			res += i;
			
		}
		
		System.out.println("결과 : " + res);
	}//main
}






























