package ex2_io;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO(Input, Output)
		//IO�� ����� ��Ʈ���� �ǹ��Ѵ�.
		//��Ʈ���̶�, �����͸� ������ϱ� ���� ������ ���
		//JVM���� �ַܼ� ���� �������� Output, �ݴ�� �ܼ��� ���� JVM����
		//�������� Input
		
		//FileŬ������ ������ ���
		String path = "c:/java_0114/test.txt";
		
		//������ �غ��� ��η� FileŬ���� ��ü ����
		File f = new File(path);
		
		//fileŬ������ ������ path��ΰ� �������� �������� ���� ����
		if( f.isFile() ) {//f.isFile() == true
			System.out.println("������ ũ�� : " + f.length() + "byte");
		}
		
	}//main
}









































