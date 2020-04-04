package ex3_multi_for;

public class Ex4_multiFor {
	public static void main(String[] args) {
		
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		for( int i = 1; i <= 5; i++ ) {
			
			for( int j = 0; j < i; j++ ) {
				
				System.out.print("* ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("-------------------------");
		
		//        *
		//      * * *
		//    * * * * *
		//  * * * * * * *
		//* * * * * * * * *
		for( int i = 0; i < 5; i++ ) {
			
			for( int j = 0; j < 5+i; j++ ) {
				
				if(i + j > 3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}






































