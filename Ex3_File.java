package ex2_io;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {

		String path = "c:/java_0114";
		File f = new File(path);
		
		if( f.isDirectory() ) {
			
			//path����� ���� ��ϵ��� FileŬ���� �������� �޾ƿ���
			File[] arr = f.listFiles();
			
			for( int i = 0; i < arr.length; i++ ) {
				
				if( arr[i].isDirectory() ) {
					System.out.println( arr[i].getName() );
				}
			}
			
		}
		
	}//main
}









































