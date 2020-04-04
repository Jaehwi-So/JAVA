package ex4_continue;

public class Ex3_label_continue {
	public static void main(String[] args) {
		
		outer : for( int i = 1; i <= 5; i++ ) {
			
			for( int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					continue outer;
				}
				
				System.out.print(j + " ");
				 
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}







