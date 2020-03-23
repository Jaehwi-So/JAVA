package ex2_awt_event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyEventListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override //우상단 x버튼 클릭이벤트 감지
	public void windowClosing(WindowEvent e) {
		
		System.out.println("x버튼을 클릭함. 종료합니다");
		System.exit(0);	//종료
		
		
		/* 
		Frame f = new Frame("새 프레임");
		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);
		*/
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override	//우측 상단의 최소화 버튼 클릭이벤트 감지
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화 버튼을 클릭함");
		
	}

	@Override	//최소화 상태에서 원래 크기로 돌아왔을 때 호출되는 메서드
	public void windowDeiconified(WindowEvent e) {
		System.out.println("원래 크기로 돌아옴");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
