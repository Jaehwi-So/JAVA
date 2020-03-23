package ex3_object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ScoreLoader {
	
	private RspInfo info;
	public RspInfo getInfo() {
		return info;
	}

	public ScoreLoader(RspInfo info) {
		this.info = info;
		String path = "RspScore/"+info.getName()+"/UserInfo.sav";
		File f = new File(path);
		
		if(f.exists()) {
			ObjectInputStream ois = null;
			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				
				this.info = (RspInfo)ois.readObject();
				System.out.println("로드성공");
						
			} catch (Exception e) {
				System.out.println("로드실패");
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		else {
			System.out.println("새로운 아이디가 생성되었습니다");
		}
		
	}


}
