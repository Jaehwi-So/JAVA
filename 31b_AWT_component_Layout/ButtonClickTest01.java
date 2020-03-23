package ex6_layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonClickTest01 {
	public static void main(String[] args) {
		Frame f = new Frame("Button event");
		f.setBounds(400, 200, 1030, 500);
		f.setLayout(null);
		
		//버튼 추가, 위치/크기 설정
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		btn1.setBounds(100, 100, 200, 100);
		btn2.setBounds(310, 100, 200, 100);
		btn3.setBounds(520, 100, 200, 100);
		btn4.setBounds(730, 100, 200, 100);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		//각 버튼에 이벤트 감지자 등록
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1번을 클릭하였습니다");
			}
		});
		
		
		//감지자를 묶어서 처리하는 방법
		ActionListener al = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//e는 버튼의 텍스트를 식별한다.
				if(e.getActionCommand().equals("버튼2")) {
					System.out.println("버튼 2번을 클릭하였습니다.");
				}
				else if(e.getActionCommand().equals("버튼3")) {
					System.out.println("버튼 3번을 클릭하였습니다.");
				}
				else if(e.getActionCommand().equals("버튼4")) {
					System.out.println("버튼 4번을 클릭하였습니다.");
				}
			}
		};
		
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);
		
		f.setVisible(true);
		
		//종료 이벤트 추가
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//==
		
	}
}