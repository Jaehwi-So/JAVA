package ex1_awt;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex2_FrameTest {
	public static void main(String[] args) {
		Frame f = new Frame("두번째 프레임");
		f.setSize(400, 400);	//(너비, 높이)
		
		//Toolkit클래스를 통해서 현재 사용중인 모니터의 해상도를 얻어 올 수 있다.
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		
		//모니터의 너비 및 높이
		int moniterW = di.width;
		int moniterH = di.height;
		
		//모니터의 중앙에 위치하도록 프레임 생성
		int x = moniterW/2 - f.getWidth()/2;
		int y = moniterH/2 - f.getHeight()/2;
		
		//setBounds(x, y, 400, 400) == setSize(400, 400) / setLocation(x, y)
		f.setLocation(x, y);
		f.setVisible(true);
	}
}

