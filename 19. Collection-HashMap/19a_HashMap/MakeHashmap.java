package hashmap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
//HashMap
/*
 HashMap은 Map 인터페이스를 구현한 클래스. 쌍으로 된 자료를 HashMap을 이용하여 관리하면 편리하다.
 해시 방식의 자료를 저장하는 공간인 해시 테이블. key값이 정해지면 그에 대응하는 해시 테이블의 저장 위치가 정해지는데 이 위치를 반환하는 함수를 해시 함수라고 한다.
 index=hash(key값)
 Map 인터페이스에서 사용되는 key값은 중복될 수 없으므로 equals()메서드와 hashcode()메서드를 재정의하여 사용하는 경우가 많다.
 */
public class MakeHashmap {
	//HashMap<Key,Value>
	Map<Integer, String> m1 = new HashMap<Integer, String>();
	
	//자료 추가		
	void inputMap(Integer i, String s){
		m1.put(i, s); //put(key,value) : 해시 테이블에 데이터 추가
		}
	
	//해시맵의 전체 자료 출력
	void printMap() {		
	   //Map.Entry<> : HashMap의 한 쌍의 entry를 나타냄. // m1.entrySet():전체쌍.  
		for (Map.Entry<Integer, String> entry : m1.entrySet()) {    
		    Integer code = entry.getKey();              //getValue() : 현재 entry에서 HashMap의 Value값(두번째 요소) read
		    String country = entry.getValue();          //getKey() : 현재 entry에서 HashMap의 Key값(첫번째 요소) read  
		   // if(code.toString().charAt(0) == '1') {        //code를 String으로 바꿔 첫번째 문자가 1일 때
		        System.out.printf("%s:%d\n",country,code);     //출력		        
		  //  }
		}
	}
	
	//Iterator을 통한 전체 자료 순회, 출력
	void printMapByIter() {		
		Set<Integer> setCode = m1.keySet();        //     setCode : m1의 key들의 set. key값은 중복될 수 없으므로 반환형은 Set이다.
		Collection<String> setCountry = m1.values();      //setCountry : m1의 value들의 collection. value값은 중복가능하므로 반환형은 Collection이다.
		Iterator<Integer> iterator = setCode.iterator();		 
		while (iterator.hasNext()) {                        //iterator가 next값을 가지고 있는가?
			Integer code = iterator.next();
		    String country = m1.get(code);	//m1.get(key) : 해당 key값에 해당하는 value값을 읽는다.
		    System.out.printf("%d:%s\n",code,country);	    
		   // if(code.toString().charAt(1) == '1') {
		   //     System.out.printf("%d:%s\n",code,country);
		   // }
		}	 
	}	
	
	void searchCountry(int code) {
		if(m1.containsKey(code)) { //containsKey(key) : Hashmap이 해당 key값을 가지면 true반환
			System.out.printf("국가번호 %d에 해당하는 국가는 %s입니다.\n",code,m1.get(code));
		}
		else {
			System.out.println("해당 국가를 찾지 못하였습니다.");
		}
	}
	
	public static void main(String[] args) {
		MakeHashmap map = new MakeHashmap();
		map.inputMap(1,"Canada");
		map.inputMap(82,"Seoul");
		map.inputMap(81,"Japen");
		map.inputMap(86,"China");

		map.printMap();
		map.printMapByIter();
		map.searchCountry(1);
	}

}