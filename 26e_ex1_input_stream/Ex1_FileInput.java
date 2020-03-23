package ex2_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		//Byte기반의 스트림(1byte단위로 읽고 쓰는 스트림)
		//...Stream <-- byte기반의 스트림!!!
		
		//Char기반의 스트림(2byte단위로 읽고 쓰는 스트림)
		//...Reader, ...Writer  <-- char기반의 스트림!!
		
		
		String path = "c:/java_0114/test.txt";
		File f = new File(path);
		
		//File클래스가 참조하는 경로가 물리적으로 존재하는경우 true
		if( f.exists() ) {
			
			//파일클래스와 연결된 InputStream을 생성
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				while( (code = fis.read()) != -1 ) {
					//FileInputStream은 기본적으로 1byte만을 지원하므로
					//2byte인 한글을 읽어올 때 문제가 발생한다.
					System.out.print((char)code);
					
				}//while
				
				//스트림은 열고 사용한 후, 반드시 닫아줘야 한다.
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}











































