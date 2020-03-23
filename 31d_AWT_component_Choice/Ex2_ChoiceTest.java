package ex2_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_ChoiceTest {
	
	public static void main(String[] args) {
		Frame f = new Frame("지역 Choice");
		f.setBounds(300, 200, 500, 400);
		f.setLayout(null);
		
		Choice where = new Choice();
		where.add("지역 선택");
		where.add("서울");
		where.add("경기");
		where.add("부산");
		where.add("강원");
		where.add("대구");
		where.add("울산");
		where.setSize(150, 0);	
		where.setLocation(50, 100);
		
		ItemListener ls = new ItemListener() {		
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = (String)e.getItem();
				if(str.equals("지역 선택")) {
					System.out.println("반드시 하나의 지역을 선택해야 합니다.");
				}
				else {
					System.out.println(str+" 선택");
				}
			}
		};
		
		f.add(where);
		//where.addItemListener(ls);
		where.addItemListener(new Ex2_ChoiceEvent());	//클래스를 나누어 이벤트 처리하기
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
