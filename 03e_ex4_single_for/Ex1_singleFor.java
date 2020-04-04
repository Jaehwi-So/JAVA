package ex4_single_for;

public class Ex1_singleFor {
	//#반복문 : 특정 코드를 여러 번 반복할 수 있도록 해주는 제어문
	public static void main(String[] args) {
		//for문 : 특정 명령을 원하는 만큼 반복적으로 수행하기 위한 문법
		/*
		 for(초기식; 조건식; 증감식;){
		 	조건식이 참일 때 실행되는 영역 }
		 */
		for(int i = 0; i < 3; i++) {
			//i는 현재 for문 안에서만 사용 가능한 지역 변수
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i = 0; i < 3;) {
			System.out.print(i+" ");
			i++;
		}
		
		int k;
		for(k = 1; k <= 3; k++) {
			System.out.print(k+" ");
			
		}
		System.out.println("================");
		//10부터 1까지 감소되는 값을 화면에 출력
		for(int i = 10; i > 0; i--) {
			System.out.print(i+" ");
		}
		System.out.println("================");
		//1부터 100까지 반복하는 for문에서 3의 배수만 화면에 출력
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
