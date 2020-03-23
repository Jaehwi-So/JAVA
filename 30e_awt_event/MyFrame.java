package ex3_awt_event;

import java.awt.Frame;

public class MyFrame {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300, 300);
		f.setLocation(500, 200);
		
		//이벤트 감지.
		f.addWindowListener(new ListenerChild());
		
		f.setVisible(true);
	}
}
