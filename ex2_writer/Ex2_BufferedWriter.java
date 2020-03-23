package ex2_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2_BufferedWriter {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("c:/java_0114/BufWriter예제.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("BufferedWriter의 테스트 입니다");
			bw.newLine();//엔터값을 입력하는 메서드
			bw.write("두번째 줄입니다");
			
			//쓰고자 하는 내용을 물리적으로 기록하기 위한 메서드
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}












