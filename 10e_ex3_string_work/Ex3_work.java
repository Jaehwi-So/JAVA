package ex1_string_work;

import java.util.Scanner;

public class Ex3_work {
	/*
	 * 주민번호를 입력하세요(-포함)
	 * 970121-1234567
	 * 당신은 97년 1월 21일에 태어난 남성입니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("주민번호 입력 (xxxxxx-xxxxxxx) : ");
		String mem_number = sc.next();
		if(mem_number.trim().length() != 14 || mem_number.charAt(6) != '-') {

			System.out.printf("주민번호 형식이 올바르지 않습니다");
		}
		else {
			String year = mem_number.substring(0, 2);
			String month = mem_number.substring(2, 4);
			String day = mem_number.substring(4, 6);
			String gender = ""+mem_number.charAt(7);
			
			if(Integer.parseInt(gender) % 2 == 0) {
				gender = "여성";
			}
			else {
				gender = "남성";
			}
			
			System.out.printf("당신은 %s년 %s월 %s일에 태어난 %s입니다.", year, month, day, gender);
			
		}
		sc.close();
	}
}
