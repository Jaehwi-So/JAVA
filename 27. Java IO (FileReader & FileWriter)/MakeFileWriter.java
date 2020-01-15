package fileio3;

import java.io.FileWriter;
import java.io.IOException;

//Writer : ���� ������ �д� ��Ʈ�� �� �ֻ��� ��Ʈ��
/*
FileWriter : ���Ͽ��� ���� ������ ���� ��Ʈ�� Ŭ����
InputStreamWriter : ����Ʈ ������ �� �ڷḦ ���ڷ� ��ȯ�� �ִ� ���� ��Ʈ��
BufferedWriter : ���ڷ� �� �� �迭�� �����Ͽ� �Ѳ����� ���� �� �ִ� ����� �����ϴ� ���� ��Ʈ��
*/
public class MakeFileWriter {
	void charWriter() {
		try(FileWriter fw = new FileWriter("output.txt");) { //FileWriter ����. FileWriter(String name), FileWriter(File f)
			//FileWriter(String name, boolean append) : append���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ���� ���� �̾ ����.
			fw.write('A');	//void write(int c) : �� ���ڸ� ���
			char buf[] = {'B','C','D','E'};
			fw.write(buf);	//void write(char[] buf) : �迭 buf�� ������ ���Ͽ� ���
			fw.write(buf,1,2); //void write(char[] buf, int off, int len) : buf�� ������ off��ġ���� len��ŭ ���
			fw.write(65);
			fw.write(" Hello ");//void write(String s) : ���ڿ� s�� ���
			fw.write("Wwworld",2,5);//void write(String s, int off, int len) : s�� ������ off��ġ���� len��ŭ ���
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
