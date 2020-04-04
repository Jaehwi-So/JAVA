package ex4_single_for;

import java.util.Scanner;

public class Ex2_singleFor {
	/*
	 단 : 2~9 입력
	 */
	public static void main(String[] args) {
		System.out.print("단 입력(2~9) : ");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		if(dan <= 1 || dan >= 10) {
			System.out.println("1에서 9사이의 값을 입력하세요");
		}
		else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
		}
		sc.close();
	}

}
