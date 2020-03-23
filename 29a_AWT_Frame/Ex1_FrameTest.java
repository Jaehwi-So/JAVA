package ex1_awt;
//UI

import java.awt.Color;
import java.awt.Frame;

public class Ex1_FrameTest {
	
	public static void main(String[] args) {
		//화면을 만들고 디자인하기 위한 awt패키지의 클래스들
		Frame frame = new Frame("첫 프레임");
		//.setBounds(x좌표, y좌표, 너비, 높이) 인 테두리를 만든다.
		frame.setBounds(500, 400, 400, 300);
		frame.setBackground(Color.BLUE);	//배경색 설정
		
		//생성한 프레임을 화면에 노출하는 메서드
		frame.setVisible(true);
	}
}
