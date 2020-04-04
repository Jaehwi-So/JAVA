package ex2_switch;

import java.util.Scanner;

public class Ex4_switch_work {
	//몇 월생? : (입력)
	//7월은 31일까지 있습니다.
	public static void main(String[] args) {
		System.out.print("월을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(month+"월은 31일까지 있습니다");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(month+"월은 30일까지 있습니다");
			break;
		case 2 :
			System.out.println(month+"월은 28-29일까지 있습니다");
		default :
			System.out.println(month+"월은 존재하지 않습니다");
			break;
		}
		sc.close();
	}
}

