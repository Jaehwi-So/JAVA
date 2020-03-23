package ex2_io;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO(Input, Output)
		//IO는 입출력 스트림을 의미한다.
		//스트림이란, 데이터를 입출력하기 위한 일종의 통로
		//JVM에서 콘솔로 값을 내보내면 Output, 반대로 콘솔의 값을 JVM에서
		//읽을때는 Input
		
		//File클래스가 접근할 경로
		String path = "c:/java_0114/test.txt";
		
		//위에서 준비한 경로로 File클래스 객체 생성
		File f = new File(path);
		
		//file클래스가 접근한 path경로가 폴더인지 파일인지 구별 가능
		if( f.isFile() ) {//f.isFile() == true
			System.out.println("파일의 크기 : " + f.length() + "byte");
		}
		
	}//main
}





































