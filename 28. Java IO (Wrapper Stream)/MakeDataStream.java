package fileio4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//DataInputStream과 DataOutputStream
 //다음 스트림들은 텍스트 형식의 자료를 다루었던 스트림들과는 달리 메모리에 저장된 자료형의 크기를 그대로 보존한 채 입출력을 한다. 따라서 입출력시 자료형이 일치하지 않을 시 데이터를 가져올 수 없다.
public class MakeDataStream {
	
	void dataStream() {
		try(FileOutputStream fos = new FileOutputStream("output3.txt");
		    DataOutputStream dos = new DataOutputStream(fos);){
			dos.writeByte(10);
			dos.writeChar('A');
			dos.writeInt(123);
			dos.writeUTF("Hello world");//다양한 자료형으로 기록할 수 있다.
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	
		try(FileInputStream fis = new FileInputStream("output3.txt");
		    DataInputStream dis = new DataInputStream(fis);){
			System.out.println(dis.readByte()); //가져올 데이터에 맞는 자료형의 형태로 읽을 수 있다.
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
