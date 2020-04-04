package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		//switch문 : 조건값과 비교값을 확인하며 일치하는 경우 결과를 실행하는 반복문
		/*
		 swithch(비교값){
		 	case 조건값 : 
		 		비교값과 조건값이 일치하면 실행되는 영역
		 		break;
		 	case ....
		 }
		 */
		int n = 2;
		switch(n) {
		case 1 :
			System.out.println("1. 게임하기");
			break;
		case 2 :	//조건값과 비교값 일치
			System.out.println("2. 게임소개");
			break;	//switch문을 통째로 빠져나온다.
		case 3 : 
			System.out.println("3. 게임종료");
			break;
		}
	}
}
