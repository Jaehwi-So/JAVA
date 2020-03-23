package ex3_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class ex1_Set {
	public static void main(String[] args) {
		/*Collection 객체의 대표적인 인터페이스.
		Set, Map, List
		컬렉션은 제너릭타입을 요구하는 일종의 배열과 같은 인터페이스
		단, 배열처럼 index의 갯수가 정해져 있지 않으므로 다양한 동적처리가 가능하다는 장점이 있다.
		
		Set은 java.util패키지에 존재하는 인터페이스이다.
		특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용한다.
		Set을 구현하는 클래스 중 가장 많이 사용되는 HashSet과 TreeSet을 살펴보자.
		*/
		
		/* HashSet : 중복허용 x, 정렬기능 없음 */
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("alice");
		hs1.add("bob");
		hs1.add("meloly");
		hs1.add("alice"); //Set의 특징 : 중복을 허용하지 않는다.
		System.out.println(hs1.size());
		System.out.println(hs1); //Collection의 모든 요소들을 확인 가능
		
		System.out.println("========== HashSet을 이용한 로또번호 생성기 =============");
		HashSet<Integer> hs2 = new HashSet<>();
		while(hs2.size() < 6) {
			int r = new Random().nextInt(45)+1;
			hs2.add(r);
		}
		System.out.println(hs2);
		
		//index가 존재하지 않는 Set구조를 제어하기 위해서 반복자라고 부르는 Iterator을 사용한다.
		//Collection 데이터 집합의 시작 위치에 커서를 놓는다고 생각한다.
		int[] res = new int[hs2.size()];
		Iterator<Integer> ir = hs2.iterator();
		for(int i=0; i<res.length; i++) {
			res[i] = ir.next();
			System.out.print(res[i]+" ");
		}
		
	}

}