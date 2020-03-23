package ex1_reader;

import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		//file.txt로 접근하여 내용을 읽어온 후, 알파벳 대소문자가 각각 몇개씩 있는지 출력
		//대문자 : 17
		//소문자 : 7
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("c:/java_0114/file.txt");
			int code = -1;
			
			int upper = 0;//대문자
			int lower = 0;//소문자
			
			while( (code = fr.read()) != -1 ) {
				
				if( code >= 'A' && code <= 'Z' ) {
					upper++;	
				}
				
				if( code >= 'a' && code <= 'z' ) {
					lower++;
				}
				
			}//while
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}









































