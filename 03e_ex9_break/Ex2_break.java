package ex3_break;

public class Ex2_break {
	public static void main(String[] args) {
		
		int i = 1;
		
		while( true ) {
			
			System.out.println(i);
			i++;
			
			if( i % 3 == 0 ) {
				break;
			}
			
		}
		
		System.out.println("-------------------");
		
		int n = 0;
		
		while( n < 10 ) {
			
			System.out.println(n);
			n++;
			
			switch( n ) {
			case 1:
				System.out.println("나는 1");
				//반복문 내부의 switch문의 break는
				//반복문을 나가는것이 아닌, switch문만 빠져나간다.
				break;
				
			case 2:
				System.out.println("나는 2");
				break;
			}//switch
			
		}//whlie
		
	}//main
}






































