package ex2_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		String path = "c:/java_0114/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		if( f.exists() ) {
			
			try {
				FileInputStream fis = new FileInputStream(f);
				
				fis.read(b_read);
				
				//위의 코드에서 fis가 b_read에 읽어온 데이터를 추가하면
				//b_read배열을 String형식으로 변경!!
				String res = new String( b_read );
				
				System.out.println(res);
				
				//열어놓은 스트림은 작업이 끝나면
				//반드시 닫아주자!!
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}














