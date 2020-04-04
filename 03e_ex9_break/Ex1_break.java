package ex3_break;

public class Ex1_break {
	public static void main(String[] args) {
		
		//break : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나갈 때
		//사용하는 키워드
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					//아래의 모든 코드를 무시하고 가장 가까운 반복문을
					//통째로 빠져 나간다.
					break;
					//System.out.println("안돼!!!");
				}
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}











































