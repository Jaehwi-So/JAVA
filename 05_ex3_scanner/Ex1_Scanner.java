package ex3_scanner;

import java.util.Scanner;

//자동 import : 컨트롤+시프트+O

public class Ex1_Scanner {
	public static void main(String[] args) {
		//Scanner : 키보드에서 값을 입력받기 위한 클래스
		Scanner sc = new Scanner(System.in); //sc + 컨트롤 스페이스바 : 자동완성
		System.out.print("정수 : ");
		int n = sc.nextInt();	//nextInt() 정수 입력
		System.out.println("결과 : "+n);

		System.out.print("문장 : ");
		String str = sc.next();	//next() 문자열 입력
		System.out.println("결과 : "+str);
		sc.close();
	}
}
