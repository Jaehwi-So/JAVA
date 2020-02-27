package ex3_try_catch;

import java.util.Scanner;

//정수 : 100
//결과 : 100

//정수 : aaa
//aaa은(는) 정수가 아닙니다.
public class ExamTryCatch {
	public static void main(String[] args) {
		String str= "";
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력하세요");
			try {
				str = sc.next();
				int number = Integer.parseInt(str);	//Integer.parseInt(str) : 문자열을 정수로 변환
				System.out.println(str);
				break;
			}catch(Exception e){
				System.out.println(str+"은(는) 정수가 아닙니다");
			}
		}
	}

}

