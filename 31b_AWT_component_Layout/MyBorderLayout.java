package ex6_layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyBorderLayout {
	public static void main(String[] args) {
		Frame f = new Frame("Border Layout");
		
		//BorderLayout은 컴포넌트를 동서남북, 센터에 위치시키는 레이아웃
		f.setLayout(new BorderLayout());
		f.setBounds(500, 400, 400, 400);
		
		//버튼
		Button btn1 = new Button("북");
		Button btn2 = new Button("서");
		Button btn3 = new Button("중앙");
		Button btn4 = new Button("동");
		Button btn5 = new Button("남");
		Button btn6 = new Button("그냥 버튼");
		
		//버튼 추가, 배치. BorderLayout으로 다섯 구역에 배치 가능하다.
		f.add(btn1, BorderLayout.NORTH);
		f.add(btn2, BorderLayout.WEST);
		f.add(btn3, BorderLayout.CENTER);
		f.add(btn4, "East"); //이런식으로 String형식의 배치 가능. 첫문자를 대문자로 작성.
		f.add(btn5, "South");
		

		f.add(btn6, BorderLayout.CENTER);	//중복된 위치에 컴포넌트를 넣으면 마지막으로 넣은 컴포넌트로 갱신된다.
		
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