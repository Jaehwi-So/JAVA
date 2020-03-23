package fileio4;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MakeOutputStreamWriter {
	
	//바이트 스트림을 문자로 변환해주는 보조 스트림 OutputStreamWriter
	void OSWStream() {
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw_output.txt"));) { 
			//보조 스트림인 OutputStreamWriter을 기반 스트림인 FileOutputStream을 매개변수로 받아 생성하였다.
			osw.write("안녕하세요");			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//BufferedOutputStream : 이미 생성된 스트림에 배열 기능을 추가하여 더 빠르게 입출력을 처리하게 만드는 보조 스트림
	void bufferedOS() {
		try(FileOutputStream fos= new FileOutputStream("osw_output2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			bos.write(63);									
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
