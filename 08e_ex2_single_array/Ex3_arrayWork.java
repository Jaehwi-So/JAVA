package ex1_single_array;

import java.util.Scanner;

public class Ex3_arrayWork {
	
	public static void main(String[] args) {
		//알파벳을 몇 글자 출력하시겠습니까? 5
		//ABCDE
		System.out.println("알파벳을 몇 글자 출력하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char cArr[] = new char[n];
		
		for(int i = 0; i < cArr.length; i++) {
			cArr[i] = (char)(65 + (i % 26));
			System.out.printf("%c ",cArr[i]);
		}		
	}
}
