package ex2_buffered_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_BufferedStream {
	/*
	 FileInputStream과 BufferedInputStream을 연결함으로서 파일을 읽거나 쓸 때 버퍼링 작업을 수행할 수 있다.
	 버퍼링 작업이란, 출력할 바이트를 버퍼라는 메모리 공간에 바이트 배열로 모아두었다가 한 번에 출력하는 것. 
	 
	 버퍼라는 영역은 파일을 쓰고 받기 위해 마련된 기억장치의 한 부분이다. 입출력할 자료를 버퍼에 모아두면 전용 공간을 활용하기 때문에 입출력 속도 향상에
	 도움이 된다.
	 */
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;	//빨리 읽고 쓸 수 있도록 만든 스트림. 그러나 1byte씩 읽고 쓰는 것은 같다.
		
		String path = "test.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);	//buffered스트림은 다른 스트림을 통해서 독자적으로 입출력을 한다. -> 속도적으로 좋다.
			
			bis.read(read);
			String res = new String(read).trim();
			System.out.println(res);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bis.close();	//스트림을 닫을 때에는 연 스트림의 역순으로 닫아주자.
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
