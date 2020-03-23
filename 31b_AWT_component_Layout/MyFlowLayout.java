package ex6_layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFlowLayout {
	
	public static void main(String[] args) {
		Frame f = new Frame("Flow Layout");
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		Button btn6 = new Button("버튼6");
		
		//frame의 레이아웃을 FlowLayout으로 지정
		//FlowLayout은 컴포넌트들을 가로로 배치하는 레이아웃.
		f.setLayout(new FlowLayout());
		f.setBounds(500, 300, 400, 300);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		
		//종료 이벤트 추가
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//==
		
		f.setVisible(true);
	}
}
		