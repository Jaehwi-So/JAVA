package ex4_sleep;

import java.util.Scanner;

public class SleepMain {
	public static void main(String[] args) {
		
		//키보드에서 정수를 입력받고
		//스레드에서 입력받은 숫자를 1초 간격으로 1씩 감소시키다가
		//0이 되면 종료하시오. 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		ThreadTest t = new ThreadTest(num);
		t.start();
		
		
	}//main
}








