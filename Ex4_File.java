package ex2_io;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = "c:/java_0114/abc";
		File f = new File(path);
		
		//����Ŭ������ �����ϴ� path��ΰ� ���������� �������� ������
		if( !f.exists() ) {
			System.out.println("��������");
			f.mkdirs();//��������
			
		}else {
			System.out.println("�̹� �����ϴ� �����Դϴ�");
			
		}
	}//main
}














