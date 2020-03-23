package ex2_collection;

import java.util.ArrayList;

public class ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("장영실");
		System.out.println(list);
		
		//홍길동 제외 출력
		for(int i = 0; i < list.size(); i++) {
			if(i == 0) {
				continue;
			}
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("=================");
		
		//Generic을 지정안하면 Object타입(모든타입)을 넣을 수 있다. 단 메모리 효율을 고려하여 신중히 사용하자.
		ArrayList list2 = new ArrayList<>();	
		list2.add("String");
		list2.add(123);
		list2.add(10.5f);
		System.out.println(list2);
		
	}

}
