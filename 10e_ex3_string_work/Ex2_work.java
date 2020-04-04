package ex1_string_work;

import java.util.Scanner;

public class Ex2_work {
	//키보드에서 사용자의 이메일을 입력받고 @앞의 문장의 길이가 6보다 작거나 10보다 클 경우 "이메일 형식이 올바르지 않음"출력하기
	/*
	 * 이메일 abc@n.com : 이메일이 올바르지 않음
	 * aabbcc@k.com : 로그인 성공
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일 입력 : ");
		String email = sc.next();
		int idx = email.indexOf('@');
		if(idx < 6 || idx > 10) {
			System.out.println("이메일 형식이 올바르지 않음");
		}
		else {
			System.out.println("로그인 성공");
		}	
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("이메일 입력 : ");
		String email2 = sc2.next();
		int idx2 = email2.indexOf('@');

		
		if(email2.substring(0, idx2).length() < 6 || email2.substring(0, idx2).length() > 10) {
			System.out.println("이메일 형식이 올바르지 않음");
		}
		else {
			System.out.println("로그인 성공");
		}	
		
	}
}
