package ex3_anonymous;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnonyInner {

	public static void main(String[] args) {
		Frame f = new Frame();
		Button btn = new Button("버튼");
		f.setSize(300, 300);
		f.setLocation(400, 200);
		
		f.add(btn);
		f.setVisible(true);
		
		//버튼 클릭 감지
		
		//ActionListener은 인터페이스. new로 생성하면 메서드 재정의가 필요하다. 
		//해당 ActionLister은 익명 내부 클래스
		btn.addActionListener(new ActionListener() {			
			
			//메서드의 파라미터 안에서 만들어지는 이름없는 클래스를 익명 클래스라고 한다.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello world");	
				System.exit(0); //프레임 종료
			}
		} );
	}
}
