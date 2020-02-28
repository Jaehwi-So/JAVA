package ex3_collection;

import java.util.HashMap;

public class ex3_Map {
	public static void main(String[] args) {
		
		//Map은 key값과 value를 한 쌍으로 묶어서 저장 후 관리하는 Collection
		//key를 통해 값을 검색하므로 많은 양의 데이터를 검색하는데 있어서 좋은 성능을 발휘한다.

		HashMap<Integer, Boolean> hm = new HashMap<>();
		hm.put(1, true);	//put(key, value) / 데이터 주가. add()를 사용하지 않는다.
		hm.put(2, false);
		System.out.println(hm);
		System.out.println(hm.size());
		
		boolean res = hm.get(2);	//get(key) / 해당 key값의 value를 반환한다.
		System.out.println(res);
		
		System.out.println("===================");
		
		HashMap<String, String> hm2 = new HashMap<>();
		hm2.put("k1", "나의 key는 k1");
		hm2.put("k2", "나의 key는 k2");
		hm2.put("k3", "나의 key는 k3");
		hm2.put("k1", "안녕하세요");	//Map은 key값의 중복을 허용하지 않는다. 중복시 마지막에 추가된 value로 갱신된다.
		hm2.put("k4", "안녕하세요");	//Map은 value값의 중복은 허용한다.
		
		if(hm2.containsKey("k3")) { //Map에 해당 key값의 존재 여부를 boolean으로 반환
			System.out.println("hm2에는 해당 key값이 존재한다");
		}
		else {
			System.out.println("hm2에는 해당 key값이 존재하지 않는다.");
		}
		
		if(hm2.containsValue("나의 key는 k1")) {//Map에 해당 value값의 존재 여부를 boolean으로 반환
			System.out.println("hm2에는 해당 value값이 존재한다");
		}
		else {
			System.out.println("hm2에는 해당 value값이 존재하지 않는다.");
		}
		
		System.out.println(hm2);
		System.out.println(hm2.size());
		String res2 = hm2.get("k2");
		System.out.println(res2);
	}
}