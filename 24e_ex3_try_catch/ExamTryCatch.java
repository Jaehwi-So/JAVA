package ex2_try_catch;

import java.util.Scanner;

//Scanner를 통해서 정수를 입력받도록 하고 정수를 입력받았다면 그 값을 그대로 출력, 그렇지 않다면 정수만 입력하세요라는 메시지를 출력
//입력 : 5  출력 : 입력받은 값 : 5
//입력 : *  출력 : 정수만 입력하세요
public class ExamTryCatch {
	

	public static void main(String[] args) {
		int number = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력하세요");
			try {
				number = sc.nextInt();
				System.out.println(number);
				break;
			}catch(Exception e){
				System.out.println("정수만 입력하세요");
			}
		}
	}

}
