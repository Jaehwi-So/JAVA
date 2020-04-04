package ex3_break;

public class Ex3_label_break {
	public static void main(String[] args) {
		//lable : 특정 반복문에 이름표를 붙여
		//한 번에 두 개 이상의 반복문을 제어할 수 있도록 하는 키워드
		outer : for( int i = 1; i <= 2; i++ ){
			
			for( int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					break outer;
				}
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("----------------");
	
		int n = 1;
		out : while( true ) {
			
			switch(n) {
			case 1:
				break out;
			}
			System.out.println(++n);
			
		}//while
		
	}//main
}




