package ex2_collection;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 입력 : ID : aaa 
 * 출력 : aaa
 * 입력 : ID : bbb
 * 출력 : aaa, bbb
 */
public class ex3_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		
		while(true) {
			System.out.print("ID : ");
			String str = sc.nextLine();	
			
			//중복 검사
			//if(list.contains(str))을 통해서 할 수도 있다. contains(i) : 해당 데이터가 포함되어 있는가를 boolean으로 반환
			
			
			flag = true;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(str)) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				list.add(str);
			}
			
		
			System.out.print("ID List: ");
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();		
		}
		
	}

}
