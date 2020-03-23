package fileio;

import java.io.IOException;
import java.util.Scanner;

/*
 #스트림이란 : 자바에서의 모든 입출력은 스트림을 통해서 이루어진다. 스트림은 일종의 자료를 읽어들이거나 쓰는 데 사용하는 가상 통로이다.
 #입력 스트림 : 입출력 자료 -> 자바 응용 프로그램
 -바이트 스트림(그림, 동영상, 음성..) : FileInputStream, BufferedInputStream 등
 -문자 스트림(문자) : FileReader, BufferedReader 등
 #출력 스트림 : 자바 응용 프로그램 -> 입출력 자료
 -바이트 스트림 : FileOutputStream, BufferedOutputStream 등
 -문자 스트림  : FileWriter, BufferedWriter 등
 -> 기반 스트림과 보조 스트림으로도 분류 가능
 기반 스트림 : 읽어 들일 곳이나 써야 할 곳에서 바로 직접 읽고 쓸 수 있다. 입출력 대상에 직접 연결되어 생성되는 스트림
 보조 스트림 : 직접 읽고 쓰는 기능은 없다. 항상 다른 스트림을 포함하여 생성된다.
 */

//표준 입력을 받는 System.in.read() : 표준 입력 스트림으로 스트림에서 문자열을 바이트 단위로 읽어들인다.
public class IOStream {
	void IOsystemIn(){
		int i = 0;
		System.out.println("문자 1개를 입력해주세요");
		try {
			i=System.in.read(); //입력 스트림으로부터 바이트 하나를 읽어 들인다.
		} catch (IOException e) { //예외처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);	//스트림에서 읽어들이는 바이트는 아스키 코드의 형태이다.
		System.out.println((char)i);//char형으로 바꾸면 원래 문자가 나온다.
		
		
	}
	
	void IOsystemIn2() {
		System.out.println("문자 여러개를 입력해주세요.");
		int j = 0;
		try {
			System.out.print("start\n");
			while((j=System.in.read()) != '\n') {	//스트림을 바이트 단위로 읽어 들이면서 엔터키를 만날 때 까지 읽는다.
				System.out.print((char)j);	//문자 출력
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	



	

}
