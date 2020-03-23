package ex3_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3_BufferedOutput {
	
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("BufferedOutput.txt");
			String str =  "BufferedOutputStream의 예제";
			
			bos = new BufferedOutputStream(fos);
			bos.write(str.getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bos.close();	//버퍼 스트림을 닫아주어야 기록이 된다.
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
