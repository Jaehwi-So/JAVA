package treemap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Iterator;
//TreeMap
/*
 HashMap에서 key값을 비교하여 자료를 정렬하기 위해서 TreeMap을 사용할 수 있다.
 이진 검색 트리를 통해서 구현되어 있다.
 만약 클래스를 key값으로 사용하려면 클래스에 Comparable 인터페이스를 구현해야 한다.
 */
public class MakeTreeMap {
	//TreeMap<Key,Value>
	Map<Fruit, Integer> m1 = new TreeMap<Fruit, Integer>();

	//자료 추가
	void inputMap(Fruit f, Integer i){
		m1.put(f,i); //put(key,value) : 해시 테이블에 데이터 추가
		}
	//Iterator을 통한 전체 자료 순회, 출력
	void printMapByIter() {
		Set<Fruit> setFruit = m1.keySet();        //     setFruit : m1의 key들의 set. key값은 중복될 수 없으므로 반환형은 Set이다.
		Collection<Integer> setValue = m1.values();      //setValue : m1의 value들의 collection. value값은 중복가능하므로 반환형은 Collection이다.
		Iterator<Fruit> iterator = setFruit.iterator();
		while (iterator.hasNext()) {                        //iterator가 next값을 가지고 있는가?
			Fruit code = iterator.next();
		    Integer value = m1.get(code);	//m1.get(key) : 해당 key값에 해당하는 value값을 읽는다.
		    System.out.printf("%s:%d\n",code.name,value);
		}
	}

	public static void main(String[] args) {
		MakeTreeMap map = new MakeTreeMap();
		Fruit f1 = new Fruit("Strawberry","Korea");
		Fruit f2 = new Fruit("Banana","Philippines");
		Fruit f3 = new Fruit("Orange","Califorina");
		//Fruit f4 = new Fruit("Strawberry","Califorina"); Fruit클래스의 compareTo의 기준이 name이므로 key값으로 쓰일 Strawberry는  중복이 불가능하다.
		map.inputMap(f1,5000);
		map.inputMap(f2,2000);
		map.inputMap(f3,3000);
		map.printMapByIter();

	}

}
