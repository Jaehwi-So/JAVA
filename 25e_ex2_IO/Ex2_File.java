package ex2_io;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "c:\\java_0114";
		
		File f = new File(path);
		
		if( f.isDirectory() ) {//!f.isFile()
			//디렉토리 안에 있는 하위 요소들의 이름을 모두 가져온다.
			String[] names = f.list();
			
			System.out.println("---work폴더의 하위목록들---");
			for( int i = 0; i < names.length; i++ ) {
				System.out.println( names[i] );		
			}//for
		}
		
	}//main
}














