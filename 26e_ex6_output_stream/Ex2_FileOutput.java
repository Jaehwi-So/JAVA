package ex3_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	
	public static void main(String[] args) {
		String path = "output.txt";
		String msg = "나는 FileOutputStram의 예제입니다.";	
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(path);
			//msg라는 문자열 객체를 byte[]로 변환하여 write한다.
			fos.write(msg.getBytes());
			
			msg = "\n반갑습니다";
			fos.write(msg.getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fos.close();	//스트림은 꼭 닫아주자.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

