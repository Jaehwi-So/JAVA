package ex3_multi_for;

public class Ex1_multiFor {
	public static void main(String[] args) {
		//다중for문 : for문 안에 for문이 포함되어 있는 경우
		//1 2 3 4 5 
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		for(int i = 1; i <= 4; i++) {//y축(행)
			
			for( int j = 1; j <= 5; j++) {//x축(열)
				
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();//엔터값
			
		}//outer
		
		
	}//main
}




































