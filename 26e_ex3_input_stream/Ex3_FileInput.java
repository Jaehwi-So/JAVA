package ex2_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3_FileInput {
	public static void main(String[] args) {
		
		//file.txt로 접근한 후 내용을 읽어와
		//읽어온 내용이 회문수인지 아닌지를 판단하는 코드를 작성
		//-------------------------
		//abba는 회문수 입니다
		String oriStr = "";//원본
		String revStr = "";//원본문자열을 뒤집어서 저장할 문자열
		
		String path = "c:/java_0114/file.txt";
		File f = new File(path);
		
		FileInputStream fis = null;
		
		if( f.exists() ) {
			
			try {
				fis = new FileInputStream(f);
				
				int code = -1;
				
				while( (code = fis.read()) != -1 ) {
					
					oriStr += (char)code;
					
				}//while
				
				//원본을 뒤집어서 저장
				for( int i = oriStr.length()-1; i >= 0; i-- ) {
					revStr += oriStr.charAt(i);
				}//for
				
				if( oriStr.equals(revStr) ) {
					System.out.println(oriStr + "은 회문수");
				}else {
					System.out.println(oriStr + "은 안회문수");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				//finally영역은 반드시 호출되는 영역이므로
				//스트림의 닫는 작업은 finally영역에서 해주는것이 안전하다.
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
	}//main
}














































