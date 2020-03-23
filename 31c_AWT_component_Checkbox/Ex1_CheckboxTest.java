package ex1_checkbox;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_CheckboxTest {
	public static void main(String[] args) {
		Frame f = new Frame("질문");
		f.setLayout(null); //자동배치 끄기
		f.setBounds(500, 200, 800, 400);
		
		//레이블 추가
		Label q1 = new Label("관심분야는 무엇입니까?");
		Font font = new Font("궁서", Font.BOLD, 30);	//글씨체, 글자 속성, 사이즈
		q1.setFont(font);
		q1.setBounds(50, 0, 400, 100);
		f.add(q1);
		
		//체크박스 추가

		Checkbox sports = new Checkbox("운동", true);
		sports.setBounds(20, 80, 50, 50);
		Checkbox news = new Checkbox("뉴스");
		news.setBounds(100, 80, 50, 50);
		Checkbox music = new Checkbox("음악감상");
		music.setBounds(190, 80, 80, 50);
		Checkbox movie = new Checkbox("영화관람");
		movie.setBounds(280, 80, 80, 50);


		
		//감지자 추가
		sports.addItemListener(new ItemListener() {		
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getStateChange() == 1 ? "스포츠 선택됨" : "스포츠 선택 해제";
				System.out.println(str);
			}
		});
		
		news.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String str = e.getStateChange() == 1 ? "뉴스 선택됨" : "뉴스 선택 해제";
				System.out.println(str);
			}
		});
		
		ItemListener checkListener = new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String str = (String)e.getItem();
				String msg = "";
				
				switch(str) {
				case "영화관람":
					msg = e.getStateChange() == 1 ? "영화관람 선택됨" : "영화관람 해제";
					System.out.println(msg);
					break;
				case "음악감상":
					msg = e.getStateChange() == 1 ? "음악감상 선택됨" : "음악감상 해제";
					System.out.println(msg);
					break;
				}
				
			}
		};
		
		movie.addItemListener(checkListener);
		music.addItemListener(checkListener);
		
		f.add(sports);
		f.add(news);
		f.add(movie);
		f.add(music);
		
		//===========================================================
		//라디오 버튼 : 여러개의 항목 중 한 가지만 선택 가능한 컴포넌트

		//레이블 추가
		Label q2 = new Label("당신의 성별은 무엇입니까?");
		q2.setFont(font);
		q2.setBounds(50, 140, 400, 80);
		//체크박스 그룹 추가
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("남자", group, false);
		male.setBounds(10, 220, 50, 50);
		Checkbox female = new Checkbox("여자", group, true);
		female.setBounds(80, 220, 50, 50);
		
		
		
		male.addItemListener(new ItemListener() {		
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("남자입니다");
			}
		});
		female.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("여자입니다");
			}
		});
		
		f.add(q2);
		f.add(male);
		f.add(female);
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
