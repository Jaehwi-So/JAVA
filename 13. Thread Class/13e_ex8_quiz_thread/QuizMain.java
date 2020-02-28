package ex3_work;

import java.util.Scanner;

public class QuizMain {
	
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		Thread t = new Thread(qt);
		t.start();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int answer = 0;
		int number1, number2;
		while(i < 5) {
			number1 = (int)(Math.random()*100)+1;
			number2 = (int)(Math.random()*100)+1;
			System.out.printf("%d + %d = ", number1, number2);
			answer = sc.nextInt();
			if(number1 + number2 == answer) {
				System.out.println("정답입니다.");
				i++;
			}
			else if(number1 + number2 != answer) {
				System.out.println("오답입니다.");
			}
		}
		qt.clear = true;	
	}
}
