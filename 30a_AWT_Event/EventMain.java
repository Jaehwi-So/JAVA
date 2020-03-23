package ex2_awt_event;

import java.awt.Frame;

public class EventMain {
	public static void main(String[] args) {
		
		Frame fr = new Frame("우상단 클릭이벤트 확인");
		fr.setBounds(500, 200, 400, 400);
		
		//fr에 이벤트 감지자 등록
		fr.addWindowListener(new MyEventListener());
		
		fr.setVisible(true);
	}

}

