package ex3_object_stream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		
		//id : aaa
		//가위(s) | 바위(r) | 보(p) : r
		//당신이 이겼습니다
		//1승 0무 0패
		//다시하시겠습니까? y | n : n
		//게임을 종료합니다
		RspInfo rinfo = new RspInfo();
		Scanner sc = new Scanner(System.in);
		
		String id = "";
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		System.out.print("id : ");
		id = sc.next();
		rinfo.setName(id);
		
		ScoreLoader s1 = new ScoreLoader(rinfo);
		win = s1.getInfo().getWin();
		draw = s1.getInfo().getDraw();
		lose = s1.getInfo().getLose();
		
		rinfo.setWin(win);
		rinfo.setDraw(draw);
		rinfo.setLose(lose);
		
		System.out.printf("%d승, %d패, %d무\n", win, lose, draw);
		while(true) {
			int random = new Random().nextInt(3);
			System.out.print("가위(s) | 바위(r) | 보(p)");
			String user = sc.next();
			int usercnt = 0;
			
			//ingnorcase : 대소문자 상관 x
			if( user.equalsIgnoreCase("s")) {
				usercnt = 0;
			}
			else if( user.equalsIgnoreCase("r")) {
				usercnt = 1;
			}
			else if( user.equalsIgnoreCase("p")) {
				usercnt = 2;
			}
			
			if( usercnt - random == -2 || usercnt - random == 1) {
				System.out.println("이겼습니다");
				rinfo.setWin(++win);
			}
			else if( usercnt - random == 0) {
				System.out.println("비겼습니다");
				rinfo.setDraw(++draw);
			}
			else {
				System.out.println("졌습니다");
				rinfo.setLose(++lose);
			}
			System.out.printf("%d승, %d패, %d무\n", rinfo.getWin(), rinfo.getLose(), rinfo.getDraw());	
			System.out.println("한판 더? y|n : ");
			String select = sc.next();
			if(!select.equalsIgnoreCase("y")) {
				break;
			}
		}	
		System.out.println("게임이 종료되었습니다");
		
		//유저의 정보를 물리적으로 저장
		new ScoreWriter(rinfo);
	}//main
}












