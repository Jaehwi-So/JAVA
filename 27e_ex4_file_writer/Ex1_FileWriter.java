package ex2_writer;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("c:/java_0114/fileWriter예제.txt");
			String str1 = "나는 fileWriter의 예제입니다\n";
			String str2 = "여러줄도 써요";
			
			//FileOutputStream fos = new ....
			//fos.write( str1.getBytes() );
			
			//위의 주석과 같이 byte기반의 스트림은 문장을 바이트 배열로 변경하여 
			//기록해야 했으나, char기반의 스트림은 2byte를 지원하므로
			//byte[]로 변경할 필요없이 문자열을 그대로 파일에 쓸 수 있다!!
			fw.write(str1);
			fw.write(str2);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}









































