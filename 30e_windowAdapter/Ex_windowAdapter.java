package ex4_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex_windowAdapter {
	public static void main(String[] args) {
		Frame f = new Frame("windowAdapter구현");
		f.setBounds(400, 300, 300, 200);
		
		//f에 어댑터를 사용한 이벤트 감지
		f.addWindowListener(new WindowAdapter() {
					
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
	}

}
