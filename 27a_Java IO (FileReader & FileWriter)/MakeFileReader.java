package fileio3;

import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

//Reader : 문자 단위로 읽는 스트림 중 최상위 스트림
/*
 FileReader : 파일에서 문자 단위로 읽는 스트림 클래스
 InputStreamReader : 바이트 단위로 읽은 자료를 문자로 변환해 주는 보조 스트림
 BufferedReader : 문자로 읽을 때 배열을 제공하여 한꺼번에 읽을 수 있는 기능을 제공하는 보조 스트림
 */
public class MakeFileReader {
	
	void charReader() {
		try(FileReader fr = new FileReader("output.txt");){ //FileReader 생성/ FileReader(File f), FileReader(String name)
			int i;
			while((i=fr.read())!=-1) {	//int read() : 파일로부터 문자 하나를 읽는다.
				System.out.print((char)(i));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println();
		try(FileReader frs = new FileReader("data3.txt");){ //FileReader 생성
			char[] bs = new char[8];
			int i;
			while((i=frs.read(bs))!=-1) {	//int read(char[] buf) : 파일로부터 문자 하나를 읽어 buf 배열에 저장한다.
				for(int j=0; j<i; j++) {	//int read(char[] buf, int off, int len) : buf배열의 off위치부터 len만큼 문자를 저장한다.
					System.out.print((char)bs[j]);
				}
				System.out.println(":"+i+"문자씩 읽어들임"); //문자 수만큼 출력하게 하여 출력할 남은 문자들만 출력되도록 하였다.
			}			
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
