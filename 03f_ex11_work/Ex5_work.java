package ex5_work;


import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		
		//04 05 06 07 12 13 14 15 20 21 22 23 28 29 30
		//16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
		//01 03 05 07 09 11 13 15 17 19 21 23 25 27 29
		//08 09 10 11 12 13 14 15 24 25 26 27 28 29 30
		//02 03 06 07 10 11 14 15 18 19 22 23 26 27 30
		Scanner sc = new Scanner(System.in);
		int select = 0;//1, 0을 받을 변수
		int result = 0;//정답처리용 변수
		
		System.out.println("04 05 06 07 12 \n13 14 15 20 21 \n22 23 28 29 30");
		System.out.print("여기에 생각한 숫자가 있나요? 1 | 0 : ");
		select = sc.nextInt();
		
		if( select == 1 ) {
			result += 4;
		}
		
		System.out.println("------------------------");
		
		System.out.println("16 17 18 19 20 \n21 22 23 24 25 \n26 27 28 29 30");
		System.out.print("여기에 생각한 숫자가 있나요? 1 | 0 : ");
		select = sc.nextInt();
		
		if( select == 1 ) {
			result += 16;
		}
		
		System.out.println("------------------------");
		
		System.out.println("01 03 05 07 09 \n11 13 15 17 19 \n21 23 25 27 29");
		System.out.print("여기에 생각한 숫자가 있나요? 1 | 0 : ");
		select = sc.nextInt();
		
		if( select == 1 ) {
			result += 1;
		}
		
		System.out.println("------------------------");
		
		System.out.println("08 09 10 11 12 \n13 14 15 24 25 \n26 27 28 29 30");
		System.out.print("여기에 생각한 숫자가 있나요? 1 | 0 : ");
		select = sc.nextInt();
		
		if( select == 1 ) {
			result += 8;
		}
		
		System.out.println("------------------------");
		
		System.out.println("02 03 06 07 10 \n11 14 15 18 19 \n22 23 26 27 30");
		System.out.print("여기에 생각한 숫자가 있나요? 1 | 0 : ");
		select = sc.nextInt();
		
		if( select == 1 ) {
			result += 2;
		}
		
		System.out.println("------------------------");
		
		System.out.println("당신이 생각한 숫자는 " + result + "입니다");
	}//main
}






































