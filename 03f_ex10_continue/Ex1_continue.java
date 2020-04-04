package ex4_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문 : 반복문 내에서 특정 문장을 강제로 건너뛰고자 할 때
		//사용하는 키워드
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 5;  ) {
				
				if( j % 2 == 0 ) {
					//continue는 가장 가까운 for문의 증감식으로 이동
					//단, 가장 가까운 for문에 증감식이 없을경우 조건식으로 이동
					continue;
					//System.out.println("---");
				}
				System.out.print(j + " ");
				j++;
				
			}
			
			System.out.println();
			
		}//outer
		
	}//main
}
















































