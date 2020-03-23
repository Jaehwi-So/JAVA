package ex2_choice;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex2_ChoiceEvent implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		String str = (String)e.getItem();
		if(str.equals("요일 선택")) {
			System.out.println("반드시 하나의 요일을 선택해야 합니다.");
		}
		else {
			System.out.println(str+" 선택");
		}
	}

}
