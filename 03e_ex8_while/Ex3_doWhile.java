package ex2_while;

import java.util.Random;

public class Ex3_doWhile {
	public static void main(String[] args) {
		
		//int n = new Random().nextInt(130 - 0 + 1) + 0;
		
		//자바, jsp, 안드 시험을 봤다.
		//각 과목별 점수는 랜덤으로 0 ~ 130점을 대입
		//do-while을 통해 과목별 점수를 검사하는데, 
		//한과목이라도 100점을 넘어가게 되면 0 ~ 100사이의 값이 나올 때 까지
		//재실행 시킨다.
		//이렇게 세 과목의 점수가 모두 0~100사이가 되면 do-while문을 빠져
		//나오면서 점수를 화면에 출력
		
		//java : 97
		//jsp : 35
		//and : 100
		int java = 0;
		int jsp = 0;
		int and = 0;
		
		do{
			
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			and = new Random().nextInt(131);
			
		}while( java > 100 || jsp > 100 || and > 100 );
		
		System.out.println("java : " + java);
		System.out.println("jsp : " + jsp);
		System.out.println("and : " + and);
		
	}//main
}










