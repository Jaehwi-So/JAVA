package ex1_single_array;

import java.util.Random;

public class Ex4_arrayWork {
	
	public static void main(String[] args) {
		//변수 money에 10 ~ 5000원까지의 난수를 발생. 
		//단, 3450원, 2100원과 같이 1의자리 숫자는 반드시 0이 되도록 생성
		//발생한 난수 money를 동전으로 바꾸었을 때, 500, 100, 50, 10원짜리 동전이 각각 몇 개 거슬러지는지 판단하는 코드를 구현
		//단 가능한 가장 적은수의 동전으로 거슬러 주어야 한다.
		int[] coin = {500, 100, 50, 10};
		int money = new Random().nextInt(500) + 1;
		money *= 10;
		int[] res = new int[4];
		System.out.println("금액 : " + money);
		for(int i = 0; i < coin.length; i++) {
			res[i] = money / coin[i];
			money -= res[i] * coin[i];
			if(res[i] != 0) {
			System.out.println(coin[i]+"원 : "+res[i]);
			}
		}
	}
}
