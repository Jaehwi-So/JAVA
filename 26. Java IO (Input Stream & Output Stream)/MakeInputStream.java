package fileio2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 InputStream : 바이트 단위로 읽는 스트림 중 최상위 스트림
 -하위 클래스
 #FileInputStream(파일에서 바이트 단위로 읽어들임)
 #ByteArrayInputStream(Byte배열 메모리에서 바이트 단위로 자료를 읽어들임)
 #FilterInputStream(기반 스트림에서 자료를 읽을 때 사용되는 보조 스트림의 상위 클래스)
 */
public class MakeInputStream {
	
	void fileRead() {
		FileInputStream fis = null;
		//예외 처리로 try-catch-finally사용
		try {
			//FileInputStream : 파일에서 바이트 단위로 읽어들이는 스트림
			fis = new FileInputStream("data2.txt"); //"input.txt"를 읽어들이는 스트림 fis 생성
			int i;
			while((i=fis.read())!=-1) { //int read() : 파일의 끝에 도달하는 경우 read()메서드는 -1을 반환한다. 파일의 끝에 도달할 때 까지 한 바이트씩 반복해서 읽어들인다.
				System.out.print((char)(i));
			}
		} catch (FileNotFoundException e) { //파일을 찾지 못했을 경우의 예외처리
			e.printStackTrace();
		} catch (IOException e) { //입출력에 대한 예외처리
			e.printStackTrace();
		} finally {
			try {
				fis.close(); //void close() : 열린 스트림을 닫는다.
			} catch (IOException e) {	//스트림이 생성되지 않았을 경우의 예외처리
				e.printStackTrace();
			}
		}
		
	}
	
	void fileRead2(){		
		//예외처리로 try-with-resource 사용
		try(FileInputStream fis = new FileInputStream("input.txt");) {
			byte[] bs = new byte[4];
			int i;
			while((i=fis.read(bs))!=-1) { //int read(byte b[]) : 입력 스트림으로부터 바이트 배열의 크기의 자료를 b[]에 읽는다. 읽은 자료의 바이트 수 반환.
				for(byte b : bs) {
					System.out.print((char)b);
				}	
				System.out.println(":"+i+"바이트 읽어들임");//다음과 같은 형식으로 출력하면 마지막에 배열에 남아있는 기존 자료가 그대로 출력되는 것을 확인할 수 있다.
				
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(":"+i+"바이트 읽어들임"); //바이트 수만큼 출력하게 하여 출력할 남은 바이트들만 출력되도록 하였다.
			}
			fis.close();

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 	
		
	}
	


}