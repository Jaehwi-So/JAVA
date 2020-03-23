package ex3_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ScoreWriter {
	//RspInfo 객체를 저장하기 위한 클래스
	public ScoreWriter(RspInfo info) {
		//RspScore/유저아이디/UserInfo.sav파일 생성 예정
		String path = "RspScore/"+info.getName()+"/UserInfo.sav";
		
		File dir = new File("RspScore");	//RspScore 폴더 접근
		//물리적으로 폴더를 가지고 있는가?
		if(!dir.exists()) {
			dir.mkdirs();	//폴더 생성
		}
		
		File dir2 = new File(dir, info.getName());	//dir안에 유저이름의 폴더 접근
		if(!dir2.exists()) {
			dir2.mkdirs();	//폴더 생성
		}
		
		//승률정보와 id를 가지고 있는 info객체를 통째로 저장
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
			
			//ObjectOutputStream을 통해서 클래스를 통째로 저장할 준비를 함
			oos = new ObjectOutputStream(fos);
			oos.writeObject(info);
			//Serializable : 객체의 직렬화. 기록하고 싶은 객체의 멤버변수들을 복사하여 배열 형태의 자료구조로 변환하여 일렬로 사용할 수 있도록 한다.
			//객체를 직렬화가 되어 있어야 한다.
			System.out.println("기록 저장 성공");
			
		} catch (Exception e) {
			System.out.println("기록 저장 실패");
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}		
	}
}