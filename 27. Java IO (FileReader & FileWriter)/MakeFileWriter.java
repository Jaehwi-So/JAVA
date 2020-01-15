package fileio3;

import java.io.FileWriter;
import java.io.IOException;

//Writer : 문자 단위로 읽는 스트림 중 최상위 스트림
/*
FileWriter : 파일에서 문자 단위로 쓰는 스트림 클래스
OutputStreamWriter : 바이트 단위로 쓴 자료를 문자로 변환해 주는 보조 스트림
BufferedWriter : 문자로 쓸 때 배열을 제공하여 한꺼번에 읽을 수 있는 기능을 제공하는 보조 스트림
*/
public class MakeFileWriter {
	void charWriter() {
		try(FileWriter fw = new FileWriter("output.txt");) { //FileWriter 생성. FileWriter(String name), FileWriter(File f)
			//FileWriter(String name, boolean append) : append값이 true이면 파일 스트림을 닫고 다시 생성할 때 파일 끝에 이어서 쓴다.
			fw.write('A');	//void write(int c) : 한 문자를 출력
			char buf[] = {'B','C','D','E'};
			fw.write(buf);	//void write(char[] buf) : 배열 buf의 내용을 파일에 출력
			fw.write(buf,1,2); //void write(char[] buf, int off, int len) : buf의 내용을 off위치부터 len만큼 출력
			fw.write(65);
			fw.write(" Hello ");//void write(String s) : 문자열 s를 출력
			fw.write("Wwworld",2,5);//void write(String s, int off, int len) : s의 내용을 off위치부터 len만큼 출력
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
