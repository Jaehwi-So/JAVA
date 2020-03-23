package ex2_collection;

import java.util.ArrayList;

public class ex1_ArrayList {
	public static void main(String[] args) {
		//ArrayList : 중복값을 알아서 제거하거나, key와 value를 사용하는 구조는 아니지만 index 추가에 제한이 없고, 
		//Collection중 유일하게 index번호가 존재한다.
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(100);	//add(i) : 데이터 추가
		list1.add(200);
		list1.add(300);
		list1.add(400);

		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.get(2)); 	//get(idx) : 해당 index의 데이터를 반환한다.	
		list1.remove(2);	//remove(idx> : 해당 index의 데이터를 지운다. 중간에 데이터가 빠지면 나머지 index가 자동으로 갱신된다.
		list1.add(500);
		System.out.println(list1.get(2)); 	
		
		list1.set(2, 500);	//set(idx, i) : 해당 index의 데이터를 초기화한다.
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		}
		
		list1.clear(); // clear() : list의 모든 항목을 삭제		
		System.out.println(list1);
		
		System.out.println();
		

		
	}
}
