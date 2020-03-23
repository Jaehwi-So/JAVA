package ex4_person;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 입력 : ID : aaa
 * 입력 : pwd : 111
 * 출력 : aaa/111
 *--------------
 * 입력 : ID : bbb
 * 입력 : pwd : 222
 * 출력 : aaa/111 bbb/222
 */
public class PersonMain {
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String id;
		int pwd;
		
		outer : while(true) {
			System.out.print("ID 입력 :"); 
			id = sc.next();
			System.out.print("비밀번호 입력 :"); 
			pwd = sc.nextInt();

			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId().equals(id)) {
					System.out.println("ID 중복!");
					continue outer;
				}
			}		
			Person p = new Person();
			p.setId(id);
			p.setPwd(pwd);			
			list.add(p);

			
			for(int i=0; i<list.size(); i++) {
				System.out.printf("[%s / %d] ", list.get(i).getId(), list.get(i).getPwd());
			}
			System.out.println();
			
		}
		
	}
}