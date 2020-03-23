package fileio4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeInputStreamReader {
		
	//바이트 스트림을 문자로 변환해주는 보조 스트림 InputStreamReader
	void ISRStream() {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("isr_input.txt"));){ 
			//보조 스트림인 InputStreamReader을 기반 스트림인 FileInputStream을 매개변수로 받아 생성하였다.
			int i;
			while((i=isr.read())!=-1) {	//int read() : 파일로부터 문자 하나를 읽는다.
				System.out.print((char)(i));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println();
			
	}
	
	//BufferedInputStream : 이미 생성된 스트림에 배열 기능을 추가하여 더 빠르게 입출력을 처리하게 만드는 보조 스트림
	void bufferedIS() {
		try(FileInputStream fis= new FileInputStream("input.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);) {
			int i;
			while((i=bis.read())!=-1) {
				System.out.print((char)(i));
			}									
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
