package ex1_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3_BufferedReader {
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("c:/java_0114/file.txt");
			br = new BufferedReader(fr);
			
			String msg = "";
			
			//BufferedReader를 통해 한번에 한 줄 단위로 데이터를 읽어올 수 있다!!
			while( (msg = br.readLine()) != null ) {
				System.out.println( msg );
			}
			
		} catch (Exception e) {
			
		} finally {
			
			try {
				//사용한 스트림은 역순으로 닫아주자!!
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}



















































