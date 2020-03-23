package ex1_reader;

import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) {
		
		//char기반의 Stream
		//byte기반의 스트림이 ...Stream클래스를 사용했다면
		//char기반의 스트림은 ...Reader, ...Writer의 클래스를 사용한다.
		//char기반의 스트림은 일반적으로 2byte를 지원하기 때문에 한글을 읽거나
		//쓰는데 적합하다.
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("c:/java_0114/test.txt");
			int code = -1;
			
			while( (code = fr.read()) != -1 ) {
				System.out.print( (char)code );
			}//while
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				//사용이 완료된 스트림은 반드시 닫아준다
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}















































