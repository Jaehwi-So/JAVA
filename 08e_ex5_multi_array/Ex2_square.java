package ex2_multi_array;

import java.util.Scanner;

public class Ex2_square {
	public static void main(String[] args) {
		//홀수 마방진
		//홀수 : 3
		//8 1 6
		//3 5 7
		//4 9 2
		Scanner sc = new Scanner(System.in);
		int[][] arr;
		int num = 1;//시작수
		
		int y = 0;//행
		int x = 0;//열
		
		System.out.print("홀수 입력 : ");
		int size = sc.nextInt();
		
		x = size / 2;
		
		//사용자가 지정한 사이즈로 배열 생성
		arr = new int[size][size];
		
		while( num <= size * size ) {
			arr[y][x] = num;
			if( num % size == 0 ) {
				y++;
			}else {
				y--;
				x++;
			}
			if( y < 0 ) {
				y = size - 1;
			}
			if( x >= size ) {
				x = 0;
			}
			num++;
		}//while
		
		for( int i = 0; i < size; i++ ) {
			
			for( int j = 0; j < size; j++ ) {
				
				System.out.printf("%02d ", arr[i][j]);
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}






















