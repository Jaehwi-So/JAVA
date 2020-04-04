package ex3_multi_for;

public class Ex3_multiFor {
	public static void main(String[] args) {
		
		//A B C D
		//E F G H
		//I J K L
		char ch = 'A';
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j <= 4; j++) {
				
				System.out.print(ch++ + " ");
				
			}//inner
			System.out.println();
			
		}//outer
		
	}//main
}






































