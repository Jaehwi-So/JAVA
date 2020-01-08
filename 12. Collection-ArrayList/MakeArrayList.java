package arraylist;
import java.util.ArrayList;
import java.util.List;

/*ArrayList의 장점
1. 기본 배열은 길이를 변경할 수 없지만 ArrayList는 유동적으로 사용 가능하다.
2. element의 삽입과 삭제가 유동적이고 자유롭다.
데이터 추가            add()
데이터 갯수            size() 
데이터 반환         get(인덱스) 
데이터 삭제         remove(인덱스)
 */

public class MakeArrayList{
	public ArrayList<String> arr = new ArrayList<String>();   //ArrayList 선언 <>는 Generics(한가지 데이터형만 들어올 수 있도록.오류방지)
	
	public void stringAdd(String s1) {
		this.arr.add(new String(s1));         //arr.add() : ArrayList에 데이터 추가 
	}
	
	public void stringPrint() {
		System.out.println("ArrayList 출력");
		for(String n:arr) {       //arr의 모든 요소들을 차례로 n에 저장한다.
		System.out.printf("%s ",n);	  //ArrayList의 데이터 출력
		}   
		System.out.println();
		for(int i=0; i<arr.size(); i++) {    //arr.size() : ArrayList의 크기(데이터의 개수)
			System.out.printf("%s ",arr.get(i));  //arr.get(i) : ArrayList의 해당 index의 data를 읽는다(반환).			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MakeArrayList list = new MakeArrayList(); //Arraylist의 기능을 표현하는 객체 list 생성
		list.stringAdd("Red");
		list.stringAdd("Green");
		list.stringAdd("Blue");
		list.stringPrint();
		System.out.println("삭제 :"+list.arr.remove(1));  //arr.remove(i) : ArrayList의 해당 index의 data를 삭제하고 값 반환
		list.stringPrint();
	

		
	}
}

