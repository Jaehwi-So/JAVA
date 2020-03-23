package ex3_object_stream;

import java.io.Serializable;

//RspInfo클래스는 유저의 아이디와 승무패의 기록을 관리중이다. Serializable을 구현함으로서 객체 직렬화를 해야 한다.
//메모리 공간에 각각 떨어져서 자리잡혀 있던 멤버변수들을 한 번에 쓰고 받을 수 있도록 새로운 메모리 영역에 배열 형식으로 일렬로 만들어 복사한다.
public class RspInfo implements Serializable{
	private int win, lose, draw;//승, 패, 무
	private String name;//유저의 id를 저장할 변수
	
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		
	
}
