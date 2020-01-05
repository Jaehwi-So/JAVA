package linkedlist;
import java.util.LinkedList;

/*
 LinkedList
 배열의 경우 삽입과 삭제 시 메모리 상에서 자료를 이동을 시켜야 한다.
 그에 반에 연결 리스트는 가리키고 있는 주소 값의 변경으로 자료의 삽입과 삭제가 가능하다.
 따라서 자료의 변동이 많은 경우 주로 연결 리스트를 사용한다.
 배열은 메모리 상에서 i번째 메모리 위치 계산이 편리하다. 따라서 상황에 따라 두 자료구조를 활용하자.
 */

public class MakeLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList link = new LinkedList<String>();
		link.add("A"); //link.add(s) : linkedlist에 element 추가
		link.add("B");
		link.add("C");
		System.out.println(link);
		link.add(1,"b"); //link.add(index,s) : linkedlist의 해당 index에 element 추가
		link.addFirst("a"); //link.addFirst(s) : linkedlist의 맨 처음(head)에 element 추가
		link.addLast("D"); //link.addLast(s) : linkedlist의 맨 마지막에 element 추가
		System.out.println(link);
		System.out.println("삭제 "+link.remove(4)); //link.remove(index) : 해당 index의 element 삭제 후 반환
		;
		System.out.println(link);
		System.out.println("삭제 "+link.removeFirst());	//link.removeFirst() : linkedlist의 처음 element 삭제 후 반환
		System.out.println("삭제 "+link.removeLast());	//link.removeLast() : linkedlist의 마지막 element 삭제 후 반환
		System.out.println(link);
	}

}
