package ex1_string_work;

import java.util.Scanner;

public class Ex4_work {
	/*
	 * 회문수 판단하기
	 * 회문수란 앞에서 읽거나 뒤에서부터 읽어도 동일하게 읽혀지는 숫자를 말한다.
	 * abcba
	 * abccba
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String s = sc.next();
		
		//앞, 뒤 비교
		char ch1, ch2;
		boolean flag = true;
		for(int i = 0; i < s.length() / 2; i++) {
			ch1 = s.charAt(i);
			ch2 = s.charAt((s.length() - 1) - i);
			if(ch1 != ch2) {
				flag = false;
				break;
			}
		}
		if(flag == true) {
			System.out.println("회문수 입니다.");
		}
		else {
			System.out.println("회문수가 아닙니다.");
		}
		
		
		//통째로 뒤집기
		String rev = "";
		StringBuffer sb = new StringBuffer(rev);
		for(int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
			//rev += s.charAt(i);
		}
		rev = sb.toString();
		if(rev.equals(s)) {
			System.out.println("회문수 입니다.");
		}
		else {
			System.out.println("회문수가 아닙니다.");
		}
		
		sc.close();
		
	}

}
