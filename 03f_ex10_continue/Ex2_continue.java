package ex4_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {
			
			switch( i ) {
			case 1:
				System.out.println(i + "continue");
				continue;
				
			case 2:
				continue;
			
			case 3:
				continue;
				
			}//switch
			
		}//for
		
		int n = 1;
		
		while(n < 10) {
			
			n++;
			
			if( n % 2 == 0 ) {
				//while에서의 continue문은
				//아래의 모든 코드를 무시하고 while문의 조건식으로 이동
				continue;
			}
			
			System.out.println(n);
			
		}//while
		
	}
}







































