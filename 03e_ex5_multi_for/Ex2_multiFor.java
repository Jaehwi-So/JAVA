package ex3_multi_for;

public class Ex2_multiFor {
	public static void main(String[] args) {
		
		//01 02 03 04
		//05 06 07 08
		//09 10 11 12
		int cnt = 0;
		
		for( int i = 1; i <= 3; i++ ) {
			
			for( int j = 1; j < 5; j++ ) {
				
				cnt++;
				System.out.printf("%02d ", cnt);
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}







































