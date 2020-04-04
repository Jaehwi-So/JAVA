package ex2_switch;

import java.util.Scanner;

public class Ex5_switch_work {
	/*
	  정수1 : (입력)
	  정수2 : (입력)
	  연산자 : (입력)+
	 10 + 5 = 15
	 */
	public static void main(String[] args) {
		int num1, num2;
		String op;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		num2 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		op = sc.next();

		double res = 0;
		switch(op) {
		case "+" : 
			res = num1 + num2;
			System.out.println(num1+"+"+num2+"="+res);
			break;
		case "-" : 
			res = num1 - num2;
			System.out.println(num1+"-"+num2+"="+res);
			break;
		case "*" : 
			res = num1 * num2;
			System.out.println(num1+"*"+num2+"="+res);
			break;
		case "/" : 
			res = (double)num1 / num2;
			System.out.println(num1+"/"+num2+"="+res);
			break;
		default :
			System.out.println("실패");
			break;
		}
		sc.close();

	}
}
