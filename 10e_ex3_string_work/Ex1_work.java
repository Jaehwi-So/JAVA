package ex1_string_work;

import java.util.Scanner;

public class Ex1_work {
	//입력 : aqwertyuasd
	//출력 : a의 갯수 : 2
	public static void main(String[] args) {
		System.out.print("문자열 입력 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch;
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(ch == 'a') {
				cnt++;
			}
		}

		System.out.println("a의 갯수 : "+cnt);
		sc.close();
	}
}
