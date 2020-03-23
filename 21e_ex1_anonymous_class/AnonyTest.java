package ex3_anonymous;

import java.util.Random;
import java.util.Scanner;

public class AnonyTest {
	
	public static void main(String[] args) {
		//스캐너 변수 sc는 재활용하여 사용하였다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		System.out.println(num);
		
		//아래의 random 변수는 재활용하는 것이 아니라 필요시마다 생성하여 사용했다. 
		//필요할 때만 생성하여 가져다 쓰는 '이름없는' 클래스를 '익명 클래스'라고 한다.
		int random = new Random().nextInt(5) + 1; //1~5사이의 난수
		//메모리상에서 Random()은 지워진다.
		System.out.println("random : "+random);
		
		random = new Random().nextInt(5) + 1;
		System.out.println("random : "+random);
		
		
		//이렇게 하면 익명 클래스가 아님	
		Random rnd = new Random();
		
		//이렇게 하면 익명 클래스
		System.out.print("정수 : ");
		num = new Scanner(System.in).nextInt();
		System.out.println(num);
	
	}

}
