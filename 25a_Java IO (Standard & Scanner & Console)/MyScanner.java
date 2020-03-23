package fileio;

import java.util.Scanner;
//Scanner클래스.
//java.util 패키지의 입력 클래스이며 Scanner 클래스는 문자뿐 아니라 정수, 실수 등 다양한 자료형을 읽을 수 있다. 따라서 Scanner은 System.in보다 자주 사용된다.
public class MyScanner {
	public String name;
	public int age;
	public double height;

	
	void getInformation() {
		Scanner sc = new Scanner(System.in); //Scanner의 생성. 생성자로는 System.in을 사용하여 표준 입력으로부터 자료를 읽어 들이는 기능을 한다.
		//생성자로는 Scanner(File source) : 파일을 매개변수로 받아 스캐너 생성, Scanner(InputStream source) : 바이트 스트림을 매개변수로 받아 생성, 
		//Scanner(String source) : String을 매개변수로 받아 Scanner 생성 등 다양한 생성자를 가진다.
		System.out.println("학생의 이름을 입력해주세요");
		this.name=sc.nextLine();
		System.out.println("학생의 나이를 입력해주세요");
		this.age=sc.nextInt();
		System.out.println("학생의 키를 입력해주세요");
		this.height=sc.nextDouble();
		sc.close();		
		
		//Scanner 제공 매서드
		/*
		 boolean nextBoolean(), byte nextByte(), short nextShort(), int nextInt()
		 double nextDouble(), long nextLong(), float nextFloat(), String nextLine() 등
		 */
	}
	
	void printInformation() {
		System.out.printf("이름 : %s, 나이 : %d, 키 : %f",this.name,this.age,this.height);
	}

}
