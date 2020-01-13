package fileio2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
OutputStream : 바이트 단위로 쓰는 스트림 중 최상위 스트림
-하위 클래스
#FileOutputStream(파일에서 바이트 단위로 씀)
#ByteArrayOutputStream(Byte배열 메모리에서 바이트 단위로 자료를 씀)
#FilterOutputStream(기반 스트림에서 자료를 쓸 때 사용되는 보조 스트림의 상위 클래스)
*/
public class MakeOutputStream {
	
	void fileWrite() {
		try(FileOutputStream fos = new FileOutputStream("data2.txt");) { //"data2.txt"에 기록하는 스트림 fos 생성
			
			fos.write((byte)'A'); //void write(int b) : 한 바이트 기록. 아스키 코드를 입력받아 해당하는 값을 문자로 기록한다.
			fos.write(66);
			byte alpabet=67;
			byte[] bs = new byte[24];
			for(int i=0; i<bs.length; i++) {	
				bs[i]=alpabet;
				alpabet++;
			}
			fos.write(bs); //void write(byte[] b) : b[] 배열에 있는 자료를 기록
			
			fos.write(bs,10,10); //void write(byte[] b, int off, int len) : 배열에 있는 자료를 off(index)부터 len만큼 기록한다.
			
			fos.flush();
			fos.close();
			//flush() : 강제로 자료 출력, close() : 연결된 리소스를 닫음
			
		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}