package ex3_frametest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_FrameTest {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 200, 500, 500);
		Button[] btns = new Button[5];
		String[] btnTitles = {"닫기","열기","취소","확인","센터"};
		
		for(int i = 0; i < btns.length; i++) {
			btns[i] = new Button(btnTitles[i]);
		}
		
		//frame에 동서남북 위치에 각각 컴포넌트를 추가
		f.add(btns[0], BorderLayout.EAST);
		f.add(btns[1], BorderLayout.WEST);
		f.add(btns[2], BorderLayout.SOUTH);
		f.add(btns[3], BorderLayout.NORTH);
		f.add(btns[4], BorderLayout.CENTER);
		
		//동쪽에 위치한 닫기 버튼에 이벤트 감지자 등록
		btns[0].addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
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

