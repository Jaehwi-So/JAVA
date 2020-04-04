package ex1_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		
		//랜덤(난수)
		//124 ~ 1157사이의 난수 만들기
		//new Random().nextInt(발생할 난수의 범위) + 작은 수;
		//new Random().nextInt( 큰 수 - 작은수 + 1 ) + 작은수;
		int num = new Random().nextInt(1157 - 124 + 1) + 124;
		System.out.println(num);
		
	}//main
}












































