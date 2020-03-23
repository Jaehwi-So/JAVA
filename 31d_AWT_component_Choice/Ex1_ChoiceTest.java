package ex2_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_ChoiceTest {
	
	public static void main(String[] args) {
		Frame f = new Frame("선택 상자");
		
		f.setBounds(400, 200, 500, 250);
		f.setLayout(null);	//자동배치 끄기
		
		Choice day = new Choice();
		day.add("요일 선택");
		day.add("일");
		day.add("월");
		day.add("화");
		day.add("수");
		day.add("목");
		day.add("금");
		day.add("토");
		day.setSize(150, 0);	//Choice는 안에 포함되어 있는 컴포넌트의 사이즈에 따라 높이가 변하므로 높이를 지정해도 의미가 없다.
		day.setLocation(50, 100);
		
		//선택 감지자
		day.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("getSelectedItem() : "+day.getSelectedItem());	
				System.out.println("e.getItem(): "+(String)e.getItem());		
			}
		});
		
		f.add(day);
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