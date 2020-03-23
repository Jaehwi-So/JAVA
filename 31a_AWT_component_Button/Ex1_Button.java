package ex5_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {
		Frame f = new Frame("버튼 테스트");
		f.setBounds(500, 300, 400, 400);
		f.setLayout(null); //프레임의 자동배치를 끈다.
		//종료 이벤트 추가
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//==
		
		//프레임에 버튼 추가, 프레임의 자동배치를 끈 순간부터는 앞으로 프레임에 추가될 모든 객체들은 고유의 크기와 위치값을 가지고 있어야 한다.
		Button btnOK = new Button("확인");
		btnOK.setBounds(70, 90, 100, 50);	//위치, 크기 지정
		
		Button btnClose = new Button("닫기");
		btnClose.setBounds(190, 90, 100, 50);	//위치, 크기 지정
		
		f.add(btnOK);	//버튼 추가
		f.add(btnClose);
		
		f.setVisible(true);
			
	}
}
