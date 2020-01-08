package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*Iterator
ArrayList의 Collection 요소를 순회할 때 사용
Iterator ir = arrList.iterator();
이후 데이터 개수 유무 판단(boolean)     hasNext()
다음에 있는 데이터 반환           			 next()
 */

public class MakeIter {
	
	public static void main(String[] args) {
		
		String[] arr4={"Seoul","NY","Sydney"};		
		List<String> cities=Arrays.asList(arr4);     //Arrays.asList(arr) : arr4를  arraylist type으로 바꿈

				
		Iterator<String> iter = cities.iterator();  //cities Arraylist를 iterator화 한다.
		System.out.println("Iterator 출력");
		//모든 Arraylist의 요소를 순회할 때 주로 while을 통해 iterator 활용
		while(iter.hasNext()) {                     //hasNext() : iter에서 읽어들일 것이 있는가? boolean type으로 반환된다.
			String s = (String)iter.next();         //next() : iter에서 다음 index에 해당하는 data를 꺼내온다. 
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
}