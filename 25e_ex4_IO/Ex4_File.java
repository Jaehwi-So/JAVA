package ex2_io;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = "c:/java_0114/abc";
		File f = new File(path);
		
		//파일클래스가 참조하는 path경로가 물리적으로 존재하지 않을때
		if( !f.exists() ) {
			System.out.println("폴더생성");
			f.mkdirs();//폴더생성
			
		}else {
			System.out.println("이미 존재하는 폴더입니다");
			
		}
	}//main
}














