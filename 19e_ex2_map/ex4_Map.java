package ex3_collection;

import java.util.HashMap;
import java.util.Scanner;

public class ex4_Map {

	public static void main(String[] args) {	
		//ID : oh
		//pwd : 1111
		//아이디가 존재하지 않습니다.	
		//ID : kim
		//pwd : 4444
		//비밀번호가 일치하지 않습니다.	
		//ID : lee
		//pwd : 2222
		//아이디와 비밀번호가 일치합니다.
		HashMap<String, Integer> map = new HashMap<>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);

		while(true) {
			Scanner sc = new Scanner(System.in);	
			System.out.println("아이디를 입력하세요");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력하세요");
			int pwd = sc.nextInt();
			
			if(!map.containsKey(id)) {
				System.out.println("ID가 존재하지 않습니다.");
			}
			else if(map.get(id) != pwd) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			else {
				System.out.println("ID와 비밀번호가 일치합니다.");
				break;
			}
		}
		

	}
}
