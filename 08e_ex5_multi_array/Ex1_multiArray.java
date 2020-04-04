package ex2_multi_array;

import java.util.Scanner;

public class Ex1_multiArray {
	public static void main(String[] args) {

		//등록할 인원 : 2
		//이름 : hong
		//수학 : 90
		//영어 : 77
		//----------------
		//이름 : kim
		//수학 : 100
		//영어 : 98
		//----------------
		//2명 등록 완료!!
		//hong	90	77
		//kim	100	98
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 인원 : ");
		int n = sc.nextInt();

		String[] info = {"이름 : ", "수학 : ", "영어 : ", "국어 : "};
		String[][] str = new String[n][info.length];


		for( int i = 0; i < str.length; i++ ) {

			for( int j = 0; j < str[i].length; j++ ) {
				
				System.out.print(info[j]);
				str[i][j] = sc.next();
				
			}//inner
			
			System.out.println("----------------");

		}//outer

		System.out.println(n + "명 등록 완료!!");
		
		System.out.println("이름\t수학\t영어\t국어");
		
		for( int i = 0; i < str.length; i++ ) {

			for( int j = 0; j < str[i].length; j++ ) {

				System.out.print(str[i][j] + "\t");

			}//inner

			System.out.println();

		}//outer

	}//main
}











