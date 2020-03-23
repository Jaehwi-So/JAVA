package ex2_wordgame;

import java.util.Scanner;

//타자 빨리치기 게임 : 몇 초 간격으로 단어가 등장한다. 등장하는 단어를 모두 입력에 성공할 시 게임이 성공한다.
public class QuizMain {

	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		Thread t = new Thread(qt);
		t.start();
		qt.arr.add("apple");
		System.out.println(qt.arr);
		
		String s;
		while(qt.arr.size() != 0) {
			Scanner sc = new Scanner(System.in);
			s = sc.next();
			for(int i = 0; i < qt.arr.size(); i++) {
				if(s.equals(qt.arr.get(i))) {
					qt.arr.remove(i);
					System.out.println(qt.arr);
					break;
				}
			}		
		}
		qt.clear=true;
	}
	
}
