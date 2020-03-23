package ex1_fileinput;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		FileInputStream fis = null;
		byte[] read = new byte[100];
		byte[] console = new byte[100];
		try {
			System.out.print("경로 : ");
			System.in.read(console);	//읽어온 키보드의 값(System.in)을 console배열에 넣는다.
			
			//byte[]을 String형식의 문자열로 변경 : 의미없는 공백 제거, 한글을 읽을 수 있음.
			String path = new String(console).trim();
			
			fis = new FileInputStream(path);	//접근할 수 있는 통로를 만들어 준다.
			fis.read(read);	//실제로 읽어온 데이터
			
			//의미없는 공백 제거. 한글이 깨지지 않게 한다.
			String res = new String(read).trim();
			System.out.println(res);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {	
				fis.close();	//열려져 있는 스트림은 사용 후 반드시 닫아주기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}