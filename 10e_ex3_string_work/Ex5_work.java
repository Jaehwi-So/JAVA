package ex1_string_work;

import java.util.Scanner;

public class Ex5_work {
	/*
	 * 배우검색 : lee
	 * [lee]
	 * 내부자들
	 * 광해
	 * 놈놈놈
	 * 
	 * 배우검색 : aaa
	 * 해당 배우가 존재하지 않습니다.
	 */
	public static void main(String[] args) {
		
		String[][] actor = {{"[song]", "박쥐", "괴물", "관상"},
							{"[lee]", "내부자들", "광해", "놈놈놈"},
							{"[ma]", "성난황소", "이웃사람", "범죄도시"}};
		Scanner sc = new Scanner(System.in);
		System.out.print("배우 검색 : ");
		String name = sc.next();
		
		String tmp = "[";
		StringBuilder bf = new StringBuilder(tmp);
		bf.append(name + "]");
		tmp = bf.toString();
		
		for(int i = 0; i < actor.length; i++) {
			if(tmp.equals(actor[i][0])) {
				for(int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
				return;
			}
		}
		System.out.println("해당 배우가 존재하지 않습니다");
		return;
	}

}
