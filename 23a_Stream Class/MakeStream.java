package streamxx;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.ArrayList;
import java.util.stream.Stream;

//스트림
/*
 스트림이란 배열이나 Collection등의 특정 범위 안의 숫자들을 처리하는 기능을 구현해 놓은 클래스를 말한다.
 자료의 대상과 관계없이 동일한 연산을 수행하며 기존 자료를 변경시키지 않는다. 중간 연산과 최종 연산의 두 종류의 연산이 있다. 
 중간 연산은 여러번 행해질 수 있으며 최종 연산 단계에서 결과를 가져오며 스트림의 요소를 소모한다.
 */
public class MakeStream {
	
	public static void main(String[] args) {
		int[] arr= {1,3,2,6,8,5};
		int sum=Arrays.stream(arr).sum();	//arr 배열의 element들의 총 합을 반환
		int count=(int) Arrays.stream(arr).count(); //arr 배열의 element의 개수 반환
		OptionalDouble average=Arrays.stream(arr).average(); //arr 배열의 element들의 평균값
		OptionalInt max=Arrays.stream(arr).max(); //arr 배열의 element들의 max값.
		System.out.println(sum+","+count+","+average+","+max);
		
		//Collection에서 stream()메서드를 사용하면 제네릭형을 사용하여 자료형을 명시할 수 있다.

		List<String> list = new ArrayList<String>();
		list.add("tom");
		list.add("jack");
		list.add("melody");
		list.add("alice");
		list.add("bob");
		Stream<String> myStream = list.stream(); // ArrayList의 stream생성
		
		myStream.forEach(s->System.out.print(s+" ")); //배열의 요소를 하나씩 꺼내어 출력
		System.out.println();
		//한번 생성하고 사용한 스트림은 재사용 할 수 없다 -> 스트림은 요소들을 하나씩 순회하면서 출력에 사용하며, 이는 재사용 불가능하다.
		list.stream().sorted().forEach(s->System.out.print(s+" "));//sorted(), 스트림을 새로 만들어 정렬 후 배열의 요소를 하나씩 꺼내어 출력
		System.out.println();
		list.stream().filter(s->s.length()<=4).forEach(s->System.out.print(s+" ")); //중간 연산 filter(), 조건에 맞는 참인 경우만 추출
		//list.stream().map(c->c.getName()).forEach(s->System.out.print(s+" ")); //중간 연산 map(), 클래스의 요소들을 순회하며 다른 형식으로 변환함.
		System.out.println();
		System.out.println(list.stream().reduce("",(s1,s2)->{if(s1.length()>s2.length()) return s1; else return s2;}));
		//기능을 직접 지정 : reduce() : 내부적으로 스트림의 요소를 하나씩 소모하면서 기능을 수행한다. 위의 경우 가장 이름이 긴 사람이 출력된다.
		//내부적으로 반복문이 호출되면서 해당하는 부분이 리스트 요소만큼 호출된다. 처음부터 마지막까지 모든 요소를 소모한다.
	}

}
