package ex1_awt;

import java.awt.Frame;

//프레임을 상속받는 클래스
public class MyFrame extends Frame{
	public MyFrame() {
		setBounds(500, 400, 400, 400);
		setVisible(true);
	}
}
