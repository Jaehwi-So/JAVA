package ex2_io;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "c:\\java_0114";
		
		File f = new File(path);
		
		if( f.isDirectory() ) {//!f.isFile()
			//���丮 �ȿ� �ִ� ���� ��ҵ��� �̸��� ��� �����´�.
			String[] names = f.list();
			
			System.out.println("---work������ ������ϵ�---");
			for( int i = 0; i < names.length; i++ ) {
				System.out.println( names[i] );		
			}//for
		}
		
	}//main
}














