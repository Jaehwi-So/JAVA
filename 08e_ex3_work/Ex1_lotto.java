package ex1_lotto;

import java.util.Random;

public class Ex1_lotto {
	public static void main(String[] args) {
		//1 ~ 45사이의 난수를 발생시켜 중복되지 않는 6개의 숫자를
		//lotto배열에 담아 출력!!
		int[] lotto = new int[6];
		
		outer : for( int i = 0; i < lotto.length; ) {
			
			lotto[i] = new Random().nextInt(45) + 1;
			
			//중복값 체크
			for( int j = 0; j < i; j++ ) {
				
				if( lotto[i] == lotto[j] ) {
					continue outer;
				}
				
			}//inner
			
			System.out.print(lotto[i] + " ");
			i++;
			
		}//outer
		
	}//main
}











